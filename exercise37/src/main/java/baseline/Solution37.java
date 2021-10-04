/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution37 {

    /*
    create a scanner object
    have user provide list of numbers separated by spaces
    create a string array to store data
    array will only return even numbers
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();

        String list[] = data.split(" ");

        Integer evenList[] = filterEvenNumbers(list);

        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    public static Integer[] filterEvenNumbers(String list[]) {

        ArrayList<Integer> newList = new ArrayList<>();

        for(int i=0; i<list.length; i++){

            int num = Integer.parseInt(list[i]);

            if(num % 2 == 0){

                newList.add(num);
            }
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        return arr;
    }
}
