/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
 */

public class Solution30 {

    /*
    create a function that produces the multiplication table
    use a nested loop
    align each column of the table
     */

    public static void main(String[] args) {
        int tableSize = 12;
        printMultiplicationTable(tableSize);
    }

    public static void printMultiplicationTable(int tableSize) {
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("  ------------------------------------------------------");

        for(int i = 1 ;i<=tableSize;i++) {
            System.out.format("%4d |",i);
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
}
