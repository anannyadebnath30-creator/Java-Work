import java.util.Scanner;

public class Q7_ATMMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.00;
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Current balance: Rs. %.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Amount must be positive.");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = sc.nextDouble();
                    if (withdrawal <= 0) {
                        System.out.println("Amount must be positive.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
