/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code.
Ensure that the input is valid according to these rules:
The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution27 {

    /*
    create scanner object
    prompt the user to input information
    read in all the info from the user
    validate all the information given
    print out if there were errors or not
     */

    static String data = "";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        validateInput(firstName, lastName, zip, employeeID);

    }

    public static void validateInput(String firstName, String lastName, String zip, String employeeID) {
        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean idFlag = validateEmployeeID(employeeID);
        boolean zipFlag = validateZipCode(zip);
        if (first && last && zipFlag && idFlag) {
            data = "There were no errors found.";
        }
        System.out.println(data);
    }

    public static boolean validateFirstName(String firstName) {
        boolean status = true;

        if (firstName.length() < 2) {
            data = data + "The first name must be at least 2 characters long.\n";
            status = false;
        }
        if (firstName.length() == 0) {
            data = data + "The first name must be filled in.\n";
            status = false;
        }
        return status;
    }

    public static boolean validateLastName(String lastName) {
        boolean status = true;

        if (lastName.length() < 2) {
            data = data + "The last name must be at least 2 characters long.\n";
            status = false;
        }
        if (lastName.length() == 0) {
            System.out.println("The last name must be filled in.");
            status = false;
        }
        return status;
    }

    public static boolean validateZipCode(String zip) {
        boolean status = true;
        try {
            int number = Integer.parseInt(zip);
            if (zip.length() != 5) {
                data = data + "The zipcode must be a 5 digit number.\n";
                status = false;
            }
        } catch (Exception e) {
            data = data + "The zipcode must be a 5 digit number.\n";
            status = false;
        }
        return status;
    }

    public static boolean validateEmployeeID(String employeeID) {
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        if (!Pattern.matches(pattern, employeeID)) {
            data = data + "The employee ID must be in the format of AA-1234.\n";
            return false;
        }
        return true;
    }

}
