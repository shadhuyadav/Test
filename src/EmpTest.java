import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpTest {

    public static void main(String args[]){

        List<Employee> employees = Arrays.asList(
                new Employee("John Doe"),
                new Employee("Jane Smith"),
                new Employee("John Doe"),
                new Employee("Alice Johnson"),
                new Employee("Bob Brown"),
                new Employee("Jane Smith")
        );

        // Extract unique names, sort them, and create a new sorted list of Employee objects
      List<Employee>  uniqueSortedEmployees=employees.stream().map(Employee::getName).distinct().sorted().map(name-> new Employee(name)).collect(Collectors.toList());



        // Output the sorted and unique employees
        uniqueSortedEmployees.forEach(System.out::println);
    }
}
