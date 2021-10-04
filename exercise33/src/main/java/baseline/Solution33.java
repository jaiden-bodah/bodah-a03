/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Create a Magic 8 Ball game that prompts for a question and then displays either
"Yes," "No," "Maybe," or "Ask again later."
 */

import java.util.Random;
import java.util.Scanner;

public class Solution33 {

    /*
    create random object
    create scanner object
    prompt user to ask questions
    choose random answer
    print response
     */

    public static void main(String[] args) {

        String[] responses = {"Yes","No","Maybe","Ask again later"};

        Random random = new Random();


        Scanner sc = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = sc.nextLine();


        int randomResponseIndex = random.nextInt(responses.length);

        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);
        System.out.println();
    }
}
