package baseline;

import org.junit.jupiter.api.Test;

class Solution27Test {

    @Test
    boolean validateInput() {
        String firstName = null;
        String lastName = null;
        String zip  = null;
        String employeeID  = null;

        String John;
        String Johnson;
        String TK-4321;

        firstName += John;
        lastName += Johnson;
        zip += 55555;
        employeeID += TK-4321;

        return true;
    }

    @Test
    boolean validateInput2() {
        String firstName = null;
        String lastName = null;
        String zip  = null;
        String employeeID  = null;

        String J;
        String ABCDE;
        String A12-1234;

        firstName += J;
        lastName += ;
        zip += ABCDE;
        employeeID += A12-1234;

        return false;
    }
}