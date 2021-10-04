package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Solution34Test {

    @Test
    void main() {
        {
            ArrayList<String> names=new ArrayList();
            names.add("John Smith");
            names.add("Jackie Jackson");
            names.add("Chris Jones");
            names.add("Amanda Cullen");
            names.add("Jeremy Goodwin");
            Solution34Test obj=new Solution34Test();
            boolean b=names.remove("Chris Jones");

            Assertions.assertEquals(true,b);
        }

    }

    private void nameToRemove(ArrayList<String> names, String chris_jones) {
    }
}