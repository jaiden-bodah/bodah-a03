package baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void main() {

        Employee[] employees = {
                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer",00000000),
                new Employee("Jackquelyn", "Jackson", "DBA",00000000),
                new Employee("Sally","Webber","Web Developer",20151218)
        };
        
        List<Employee> list = Arrays.asList(employees);
    }
}