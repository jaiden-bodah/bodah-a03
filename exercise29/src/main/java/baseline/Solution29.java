/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Write a quick calculator that prompts for the rate of return on an investment and
calculates how many years it will take to double your investment.
 */

import java.util.Scanner;

public class Solution29 {

    /*
    create scanner object
    ask user to give the interest rate
    read in the given input
    check to make sure the input is allowed
    if allowed to calculate the amount of years it will take to double
    print out calculations
     */

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            try {
                System.out.print("What is the rate of return? ");
                int r = Integer.parseInt(sc.next());
                System.out.println("It will take " + (72 / r) + " years to double your initial investment.");
                flag = true;
            } catch (NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            } catch (ArithmeticException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if (flag)
            {
                break;
            }

        }
    }
}
