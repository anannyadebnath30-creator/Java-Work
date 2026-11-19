interface CalculateResult {
    void calculateTotal();
    void calculatePercentage();
    void calculateGrade();
}

class Student implements CalculateResult {
    String name;
    int m1, m2, m3;
    int total;
    double percentage;
    String grade;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void calculateTotal() {
        total = m1 + m2 + m3;
    }

    public void calculatePercentage() {
        percentage = total / 3.0; // Three subjects, each out of 100
    }

    public void calculateGrade() {
        if (percentage >= 75) grade = "Distinction";
        else if (percentage >= 60) grade = "First Class";
        else if (percentage >= 40) grade = "Pass";
        else grade = "Fail";
    }

    void display() {
        System.out.println("Student: " + name);
        System.out.println("Total marks = " + total + " / 300");
        System.out.printf("Percentage = %.2f%%%n", percentage);
        System.out.println("Grade = " + grade);
    }
}

public class Q16_CalculateResult {
    public static void main(String[] args) {
        Student s = new Student("Ananya", 80, 75, 90);
        s.calculateTotal();
        s.calculatePercentage();
        s.calculateGrade();
        s.display();
    }
}
