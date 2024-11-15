import java.util.*;

class Employee1 {
    private String name;
    private double salary;

    // Constructor
    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

public class DoubleEmployeeSalaries {
    public static void main(String[] args) {
        List<Employee1> emp = Arrays.asList(
                new Employee1("Alice", 50000),
                new Employee1("Bob", 60000),
                new Employee1("Charlie", 70000)
        );

        // Double the salary of each Employee1
        emp.forEach(e -> e.setSalary(e.getSalary() * 2));

        // Print updated salaries
        emp.forEach(System.out::println);
    }
}
