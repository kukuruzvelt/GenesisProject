package task.users;

public class User {
    private String email;

    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    /*модульный тест*/
    public boolean equals(User user) {
        return (this.email.equals(user.email) && this.password.equals(user.password));
    }


    /*модульный тест*/
    @Override
    public String toString(){
        return ("{\"email\":\"" + email+"\",\"password\":\""+password+"\"}\n");
    }
}
