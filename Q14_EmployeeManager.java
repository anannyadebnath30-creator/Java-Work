class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }

    void displaySalary() {
        System.out.println("Manager name: " + name);
        System.out.println("Basic salary: Rs. " + basicSalary);
        System.out.println("Bonus: Rs. " + bonus);
        System.out.println("Total salary: Rs. " + (basicSalary + bonus));
    }
}

public class Q14_EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager("Amit", 40000, 8000);
        m.displaySalary();
    }
}
