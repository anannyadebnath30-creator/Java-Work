import java.util.Scanner;

class InvalidLoginException extends Exception {
    InvalidLoginException(String message) {
        super(message);
    }
}

public class Q24_LoginCustomException {
    static void validateLogin(String username, String password)
            throws InvalidLoginException {
        if (!username.equals("admin") || !password.equals("java123")) {
            throw new InvalidLoginException("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            validateLogin(username, password);
            System.out.println("Login successful.");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
