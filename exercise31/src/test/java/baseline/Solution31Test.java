package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void main() {

        int age = 22;
        int restingPulse = 65;
        int intensity = 55;

        int expectedResult = 138;
        int result = ((220 - age - restingPulse) * intensity/100) + restingPulse;

        assertEquals(expectedResult, result);

    }
}