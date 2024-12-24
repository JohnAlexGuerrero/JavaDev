package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 55000.0, 28),
                new Employee(2, "Bob", "IT", 70000.0, 32),
                new Employee(3, "Charlie", "Finance", 80000.0, 45),
                new Employee(4, "David", "IT", 65000.0, 26),
                new Employee(5, "Eve", "HR", 72000.0, 41)
        );

        //Filtering employees based on conditions
        //by salary
        List <Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 60000.0)
                .collect(toList());

        System.out.println("high earners: " + highEarners);

        // sorting Employees
        // by salary or age
        List <Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(toList());

        System.out.println("Sorted by salary: " + sortedBySalary);

        // mapping Employee names
        // Get a list of employees names
        List <String> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(toList());

        System.out.println("Employees names: "+ employeeNames);

        // Calculating sum, average, min and max
        // calculating the total salary
        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary: " + totalSalary);

        // Calculate average salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("Average salary: " + averageSalary );

        // Find employee with max salary
        Employee highestEarner = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        System.out.println("Highest Earner: " + highestEarner);

        // grouping Employees by departament
        Map<String, List<Employee>> employeesByDepartament = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartament));
        System.out.println("Employees by departament: " + employeesByDepartament);

        // Partitioning employees based on salary
        // partition employees based on salary > 650000.0
        Map<Boolean, List<Employee>> partitionedBySalary = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 65000.0));

        System.out.println("Partitioned by salary > 65000.0: " + partitionedBySalary);

        // Count employees in each departament
        Map<String, Long> countByDepartament = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartament, Collectors.counting()));
        System.out.println("Count by departament: " + countByDepartament);

        // Checking all, any, or none conditions
        // check if all employees have salary greater than 50000.0
        boolean allHighSalary = employees.stream()
                .allMatch(e -> e.getSalary() > 50000.0);
        System.out.println("All employees earn > 50000.0: " + allHighSalary);

        // check if any employee in HR
        boolean anyInHR = employees.stream()
                .anyMatch(e -> e.getDepartament().equals("HR"));
        System.out.println("Any employees in HR: " + anyInHR);

        // Reducing (Finding sum or custom aggregation)
        // sum of salaries using reduce
        double sumSalaries = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println("Sum of salaries (reduce): " + sumSalaries);

        // creating custom collectors
        // concatenate all employee names into a single string
        String concatenatedNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Concatenated names: " + concatenatedNames);

        // finding the oldest and youngest Employee
        // find the oldest employee
        Employee oldestEmployee = employees.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .orElse(null);
        System.out.println("Oldest Employee: " + oldestEmployee);
    }
}