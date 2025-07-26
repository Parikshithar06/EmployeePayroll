import java.io.*;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Employee Payroll System ---");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Save to File");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addFullTime();
                case 2 -> addPartTime();
                case 3 -> displayEmployees();
                case 4 -> saveToFile();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    static void addFullTime() {
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        employees.add(new FullTimeEmployee(name, id, salary));
        System.out.println("Full-Time Employee added.");
    }

    static void addPartTime() {
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();
        System.out.print("Enter rate per hour: ");
        double rate = sc.nextDouble();
        employees.add(new PartTimeEmployee(name, id, hours, rate));
        System.out.println("Part-Time Employee added.");
    }

    static void displayEmployees() {
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("------------------");
        }
    }

    static void saveToFile() {
        try {
            PrintWriter writer = new PrintWriter("employees.txt");
            for (Employee emp : employees) {
                writer.println(emp.getData());
            }
            writer.close();
            System.out.println("Data saved to employees.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}
