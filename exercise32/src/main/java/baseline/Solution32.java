/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Write a Guess the Number game that has three levels of difficulty.
The first level of difficulty would be a number between 1 and 10.
The second difficulty set would be between 1 and 100.
The third difficulty set would be between 1 and 1000.
Prompt for the difficulty level, and then start the game.
The computer picks a random number in that range and prompts the player to guess that number.
Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low.
The computer should also keep track of the number of guesses.
Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.
 */

import java.util.Scanner;

public class Solution32 {

    /*
    create scanner object
    prompt the user for what difficulty they would like to play
    choose a number depending on the difficulty
    have the user input guesses until they guess correctly
    if they are wrong give them a hint
    if they are right tell them they got it and the amount of tries
    asks them if they would like to play again
     */

    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number!");
        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1);
        Scanner sc = new Scanner(System.in);
        int guess,total=0,key;

        while(true){

            total=0;

            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key=sc.nextInt();

            if(key==1)
                secretNumber = (int) (Math.random() * 10 + 1);
            else if(key==2)
                secretNumber = (int) (Math.random() * 100 + 1);
            else
                secretNumber = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");
            do{
                guess = sc.nextInt();
                total++;
                if (guess == secretNumber){
                    System.out.println("You got it in "+total+" guesses!");
                }
                else if (guess < secretNumber)
                    System.out.println("Too low. Guess again: ");
                else if (guess > secretNumber)
                    System.out.println("Too high. Guess again: ");

            }while (guess != secretNumber);

            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s=sc.next().charAt(0);
            if(s=='N' || s=='n')
                break;
        }

    }
}
