package in.aryancoding.challenge114;

import java.util.List;

public class TestingSorting {

    public static void main(String[] args) {

        List<Employee> employees = List.of(

                new Employee("Aryan", 150000),
                new Employee("Bharat", 100000),
                new Employee("swati", 50000),
                new Employee("Mayank", 2000),
                new Employee("Mintu", 30));

        employees.stream()
                .sorted((emp1, emp2)-> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
