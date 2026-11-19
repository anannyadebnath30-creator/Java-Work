import java.util.Scanner;

public class Q9_ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        long product = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            product *= sc.nextInt();
        }

        System.out.println("Multiplication of all elements = " + product);
        sc.close();
    }
}
