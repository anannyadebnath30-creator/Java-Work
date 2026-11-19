import java.io.*;
import java.util.Scanner;

class EmployeeData {
    int employeeId;
    String name;
    String department;
    double salary;

    EmployeeData(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + employeeId + ", Name: " + name
                + ", Department: " + department + ", Salary: Rs. " + salary;
    }
}

public class Q25_EmployeeFileManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Employee ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Employee name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();
            System.out.print("Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            EmployeeData employee = new EmployeeData(id, name, department, salary);

            // Store data as text bytes using FileOutputStream.
            try (FileOutputStream fos = new FileOutputStream("employee.txt");
                 PrintWriter writer = new PrintWriter(fos)) {
                writer.println(employee.employeeId);
                writer.println(employee.name);
                writer.println(employee.department);
                writer.println(employee.salary);
            }

            System.out.println("\nEmployee data saved. Reading from file:");
            try (FileInputStream fis = new FileInputStream("employee.txt");
                 BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {
                System.out.println("ID: " + reader.readLine());
                System.out.println("Name: " + reader.readLine());
                System.out.println("Department: " + reader.readLine());
                System.out.println("Salary: Rs. " + reader.readLine());
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered. Please enter numeric ID and salary.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
