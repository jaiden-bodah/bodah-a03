package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void main() {

        Scanner input = new Scanner(System.in);
        String name = null;
        ArrayList<String> nameList = new ArrayList<String>();

        do {
            System.out.println("Enter a name:");
            name= input.nextLine();

            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());
    }
}