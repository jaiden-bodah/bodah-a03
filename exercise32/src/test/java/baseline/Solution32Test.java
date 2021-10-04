package baseline;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void main() {

        int secretNumber;
        int zero = 0;
        secretNumber = (int) (Math.random() * 10 + 1);

        assertEquals(zero, secretNumber);
    }
}