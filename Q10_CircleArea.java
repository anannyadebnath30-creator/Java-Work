import java.util.Scanner;

class Circle {
    final double pi = 3.14159;
    double r;
    double a;

    void cal_area() {
        a = pi * r * r;
    }

    void display() {
        System.out.printf("Area of circle = %.2f%n", a);
    }
}

public class Q10_CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter radius: ");
        c.r = sc.nextDouble();
        c.cal_area();
        c.display();
        sc.close();
    }
}
