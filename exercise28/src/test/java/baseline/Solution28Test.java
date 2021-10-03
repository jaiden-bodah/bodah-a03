package baseline;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void main() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        final int actual = a+b+c+d+e;
        final int expected = 15;

        Assert.assertEquals(actual, expected);
    }
}