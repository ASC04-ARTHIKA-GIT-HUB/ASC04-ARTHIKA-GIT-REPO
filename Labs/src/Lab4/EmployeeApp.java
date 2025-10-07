package Lab4;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeRepository repo = new EmployeeRepository();

        repo.addEmployee(new Employee(1, "Alice", "Smith", "New York", 75000));
        repo.addEmployee(new Employee(2, "Bob", "Johnson", "Los Angeles", 68000));

        System.out.println("All Employees:");
        for (Employee e : repo.getAllEmployees()) {
            e.displayEmployee();
        }

        System.out.print("Enter Employee ID to view: ");
        int id = scanner.nextInt();
        Employee emp = repo.getEmployeeById(id);
        if (emp != null) {
            emp.displayEmployee();
        } else {
            System.out.println("Employee not found.");
        }
    }
}
