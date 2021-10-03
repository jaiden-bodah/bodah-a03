/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

    /*
    create a scanner object
    create the function isAnagram
    prompt the user to provide two strings
    check if the strings are the same length
    check if they are anagrams
    return if the two words are anagrams or not
     */

    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();
        if(isAnagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams");
        else
            System.out.println(str1 + " and " + str2 + " are not anagrams");


    }
}
