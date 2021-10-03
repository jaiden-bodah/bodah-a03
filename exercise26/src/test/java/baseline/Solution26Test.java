package baseline;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class Solution26Test {

    @Test
    void calculateMonthsUntilPaidOff() {
        double balance = 5000;
        double apr = 12;
        double payment = 100;
        int end = 70;

        double result = Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));

        Assert.assertEquals(end, result);

    }
}