/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Create a program that determines the complexity of a given password based on these rules:
A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Solution25 {

    /*
    create a scanner object
    have the user input a potential password
    check if they used upper or lower case letters
    check if they used numbers
    check if they used special symbols
    use this information to calculate if the password is strong or not
    return password strength
     */

    public static void passwordValidator(String input)
    {
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }


        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.println("Very Strong");
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.println("Strong");
        else if(hasLower || hasUpper && (n < 8))
            System.out.print("Weak");
        else
            System.out.print("Very Weak");

    }

    public static void main(String[] args)
    {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");
        input=sc.nextLine();
        passwordValidator(input);
    }

}
