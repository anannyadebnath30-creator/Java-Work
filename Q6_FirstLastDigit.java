import java.util.Scanner;

public class Q6_FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int n = sc.nextInt();

        if (n < 10000 || n > 99999) {
            System.out.println("Invalid input. Enter exactly five digits.");
        } else {
            int lastDigit = n % 10;
            int firstDigit = n / 10000;
            System.out.println("First digit = " + firstDigit);
            System.out.println("Last digit = " + lastDigit);
        }
        sc.close();
    }
}
