package task.usersDAO;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import task.users.User;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
@Scope("prototype")
public class UserDAO {
    final private static String FILE_NAME = "jsonData.json";

    public void save(User user) throws Exception {
        File file = new File(FILE_NAME);
        FileWriter fileWriter = new FileWriter(FILE_NAME);
        if (file.exists()) {
            if (file.length() == 0) {
                fileWriter.write("[" + user.toString() + "]");
            } else fileWriter.write("\b" + "," + user.toString() + "]");
        }
        fileWriter.close();
    }

    private static String readUsingFiles(String fileName) throws Exception {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public boolean check(User user) throws Exception {
        String str = readUsingFiles(FILE_NAME);
        boolean tf = false;
        if (str.contains("{\"email\":\"" + user.getEmail() + "\",\"password\":\"" + user.getPassword() + "\"}")) {
            tf = true;
        }
        return tf;
    }
}
