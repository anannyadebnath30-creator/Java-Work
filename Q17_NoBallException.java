import java.util.Scanner;

class NoBallException extends Exception {
    NoBallException(String message) {
        super(message);
    }
}

public class Q17_NoBallException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRuns = 0;
        int legalBalls = 0;

        System.out.println("Enter runs for each ball. Enter -1 for a No Ball.");
        while (legalBalls < 6) {
            System.out.print("Runs on delivery " + (legalBalls + 1) + ": ");
            int runs = sc.nextInt();

            try {
                if (runs == -1) {
                    throw new NoBallException("No Ball declared: 1 extra run added.");
                }
                if (runs < 0 || runs > 6) {
                    System.out.println("Enter runs from 0 to 6, or -1 for No Ball.");
                    continue;
                }
                totalRuns += runs;
                legalBalls++;
            } catch (NoBallException e) {
                System.out.println(e.getMessage());
                totalRuns += 1;
                // A no-ball is not a legal ball, so legalBalls does not increase.
            }
        }

        System.out.println("Total runs scored in the over = " + totalRuns);
        sc.close();
    }
}
