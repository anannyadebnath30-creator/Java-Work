import java.util.Scanner;

class Distance {
    int feet;
    int inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(int feet, int inches) {
        this.feet = feet + inches / 12;
        this.inches = inches % 12;
    }

    void get_value(Scanner sc) {
        System.out.print("Enter feet: ");
        feet = sc.nextInt();
        System.out.print("Enter inches: ");
        inches = sc.nextInt();
        feet += inches / 12;
        inches %= 12;
    }

    void show_distance() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    double centi() {
        return (feet * 12.0 + inches) * 2.54;
    }

    void display() {
        System.out.printf("Distance in centimeters = %.2f cm%n", centi());
    }
}

public class Q15_Distance {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 6);

        System.out.println("First distance:");
        d1.show_distance();
        d1.display();

        System.out.println("Second distance:");
        d2.show_distance();
        d2.display();
    }
}
