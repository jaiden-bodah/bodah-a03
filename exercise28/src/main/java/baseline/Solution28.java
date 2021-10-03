/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Write a program that prompts the user for five numbers and computes the total of the numbers.
 */

import java.util.Scanner;

public class Solution28 {

    /*
    create scanner object
    prompt the user to input 5 numbers
    create a loop for gathering the numbers
    take the 5 numbers the user inputted and calculate the total
    output total
     */

    public static void main(String[] args)

    {
        int i,n=0,s=0;
        {

            System.out.println("Input the 5 numbers : ");

        }
        for (i=0;i<5;i++)
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s +=n;
        }

        System.out.println("The total is : " +s);

    }
}
