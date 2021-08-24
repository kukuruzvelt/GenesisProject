package task.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import task.usersDAO.RateDAO;

import static org.junit.jupiter.api.Assertions.*;

class RateDAOTest {

    @Test
    void getRate() {
        RateDAO testRateDAO = new RateDAO();
        double testValue = testRateDAO.getRate();

        Assert.assertNotEquals(0,testValue);
    }
}