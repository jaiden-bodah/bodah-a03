/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time.
Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution34 {

    /*
    create an arraylist of employees
    prints the employee list
    create scanner object
    get the employee's name that is to be removed
    print out employee list again, now with the selected name removed
     */

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        printEmployees(employees);

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter an employee name to remove: ");
        String nameToRemove = sc.nextLine();

        employees.remove(nameToRemove);

        System.out.println();
        printEmployees(employees);
    }

    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees) {
            System.out.println(emp);
        }
    }
}
