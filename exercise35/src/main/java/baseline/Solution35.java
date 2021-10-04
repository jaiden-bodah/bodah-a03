/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank.
Then randomly select a winner.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    /*
    create scanner object
    get user input of names
    create an arraylist to store the names
    create a loop to take the names
    once you get the name add the name to the list
    pick a random number and sue that to determine the winner
    print out the winner
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = null;
        ArrayList<String> nameList = new ArrayList<String>();

        do {
            System.out.println("Enter a name:");
            name= input.nextLine();

            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());


        Random random = new Random();
        int randomIndex = random.nextInt(nameList.size());


        System.out.println("The winner is... "+nameList.get(randomIndex));

    }
}
