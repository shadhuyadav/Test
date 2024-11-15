import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestSalaryEmployee {

    // Define the Employee class
    static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', salary=" + salary + '}';
        }
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 80000),
                new Employee("Zharlie", 90000),
                new Employee("David", 90000)
        );

        // Find the employee with the highest salary
     Optional<Employee> highestSalaryEmployee=employees.stream().max(Comparator.comparing(s->s.getSalary()));

        // Print the result
        highestSalaryEmployee.ifPresent(System.out::println);
    }
}
