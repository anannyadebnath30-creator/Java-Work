interface Payroll {
    double calculateSalary();
    double calculateTax();
    double calculateNetSalary();
}

class PermanentEmployee implements Payroll {
    private final String name;
    private final double monthlySalary;

    PermanentEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() { return monthlySalary; }
    public double calculateTax() { return calculateSalary() * 0.10; }
    public double calculateNetSalary() { return calculateSalary() - calculateTax(); }
    public String getName() { return name; }
}

class ContractEmployee implements Payroll {
    private final String name;
    private final double contractAmount;

    ContractEmployee(String name, double contractAmount) {
        this.name = name;
        this.contractAmount = contractAmount;
    }

    public double calculateSalary() { return contractAmount; }
    public double calculateTax() { return calculateSalary() * 0.05; }
    public double calculateNetSalary() { return calculateSalary() - calculateTax(); }
    public String getName() { return name; }
}

class PartTimeEmployee implements Payroll {
    private final String name;
    private final int hours;
    private final double hourlyRate;

    PartTimeEmployee(String name, int hours, double hourlyRate) {
        this.name = name;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() { return hours * hourlyRate; }
    public double calculateTax() { return calculateSalary() * 0.02; }
    public double calculateNetSalary() { return calculateSalary() - calculateTax(); }
    public String getName() { return name; }
}

public class Q22_EmployeePayroll {
    static void showPayroll(String name, Payroll employee) {
        System.out.println("\nEmployee: " + name);
        System.out.printf("Salary: Rs. %.2f%n", employee.calculateSalary());
        System.out.printf("Tax: Rs. %.2f%n", employee.calculateTax());
        System.out.printf("Net salary: Rs. %.2f%n", employee.calculateNetSalary());
    }

    public static void main(String[] args) {
        Payroll p1 = new PermanentEmployee("Riya", 40000);
        Payroll p2 = new ContractEmployee("Aman", 30000);
        Payroll p3 = new PartTimeEmployee("Neha", 80, 250);

        showPayroll("Riya (Permanent)", p1);
        showPayroll("Aman (Contract)", p2);
        showPayroll("Neha (Part-time)", p3);
    }
}
