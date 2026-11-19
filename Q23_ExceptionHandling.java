import java.util.Scanner;

public class Q23_ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            String firstInput = sc.nextLine();
            int a = Integer.parseInt(firstInput);

            System.out.print("Enter second number: ");
            String secondInput = sc.nextLine();
            int b = Integer.parseInt(secondInput);

            System.out.print("Enter array index (0 to 4): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Division result = " + (a / b));
            System.out.println("Array element = " + values[index]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: please enter valid integers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: index must be from 0 to 4.");
        } finally {
            sc.close();
        }
    }
}
