package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    @Test
    void average() {
        int a=7;
        int b=14;
        int c=21;

        int expectedOutput=14;

        int total = a+b+c;

        int avg = total/3;

        assertEquals(expectedOutput, avg);
    }
}