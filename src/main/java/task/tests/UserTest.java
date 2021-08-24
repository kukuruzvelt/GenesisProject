package task.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import task.users.User;

class UserTest {

    @Test
    void testEquals() {
        User firstUser = new User("testEmail", "testPassword");
        User secondUser = new User("testEmail", "testPassword");
        boolean test=firstUser.equals(secondUser);

        Assert.assertTrue(test);
    }

    @Test
    void testToString() {
        User user = new User("testEmail", "testPassword");

        Assert.assertEquals("{\"email\":\"" + "testEmail"+"\",\"password\":\""+"testPassword"+"\"}\n", user.toString());

    }
}