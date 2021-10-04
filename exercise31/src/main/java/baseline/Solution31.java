/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
 Create a program that prompts for your age and your resting heart rate.
 Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
 Generate a table with the results as shown in the example output.
 */

import java.util.Scanner;

public class Solution31 {

    /*
    create scanner object
    prompt user to input resting heart rate and age
    print out resting heart rate and age
    use inputs to calculate heart rate at different intensities
    keep calculating till 95%
    output calculations
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int restingPulse;
        int age;

        while(true) {

            System.out.print("Enter Resting Pulse : ");
            String input = sc.next();

            if(isNumeric(input)) {
                restingPulse = Integer.parseInt(input);
                break;
            }else {
                System.out.println("Invalid Pulse");
            }

        }

        while(true) {

            System.out.print("Enter Age : ");
            String input = sc.next();

            if(isNumeric(input)) {
                age = Integer.parseInt(input);
                break;
            }else {
                System.out.println("Invalid Age");
            }

        }


        System.out.println("Intensity\tRate");
        for(int intensity = 55 ; intensity <= 95 ; intensity += 5) {
            int rate = ((220 - age - restingPulse) * intensity/100) + restingPulse;
            System.out.println(intensity+"%\t\t"+rate+" bpm");
        }




        sc.close();

    }


    public static boolean isNumeric(String input) {

        try {
            Integer.parseInt(input);
        }catch(Exception e) {
            return false;
        }
        return true;
    }
}
