package task.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import task.users.User;
import task.usersDAO.UserDAO;


class UserDAOTest {
    UserDAO testUserDAO = new UserDAO();

    User testUser  = new User("testEmail", "testPassword");

    @Test
    void check()  throws Exception{
        testUserDAO.save(testUser);

        Assert.assertTrue(testUserDAO.check(testUser));


    }
}