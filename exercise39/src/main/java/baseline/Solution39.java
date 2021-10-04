/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jaiden Bodah
 */

package baseline;

/*
Given the following data set,
create a program that sorts all employees by last name and prints them to the screen in a tabular format.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Solution39 {

    /*
    input the data of the employees
    create functions that set each individual piece of the table
    setup an array and sort the employees
    construct a table
     */

    public static void main(String[] args)
    {
        Employee[] employees = {
                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer",00000000),
                new Employee("Jackquelyn", "Jackson", "DBA",00000000),
                new Employee("Sally","Webber","Web Developer",20151218)
        };

// get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

// display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);


// Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

// Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

// sort employees by last name, then first name
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }
}
class Employee
{
    private String firstName;
    private String lastName;

    private String department;
    private double separationDate;

    // constructor
    public Employee(String firstName, String lastName,
                    String department,double separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate=separationDate;
    }

    // set firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // get firstName
    public String getFirstName()
    {
        return firstName;
    }

    // set lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // get lastName
    public String getLastName()
    {
        return lastName;
    }



    // set department
    public void setDepartment(String department)
    {
        this.department = department;
    }

    // get department
    public String getDepartment()
    {
        return department;
    }

    public void setseparationDate(double separationDate)
    {
        this.separationDate = separationDate;
    }

    // get salary
    public double getseparationDate()
    {
        return separationDate;
    }

    // return Employee's first and last name combined
    public String getName()
    {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    // return a String containing the Employee's information
    @Override
    public String toString()
    {
        return String.format("%-8s %-8s %s %8.0f",
                getFirstName(), getLastName(), getDepartment(),getseparationDate());
    }
}
