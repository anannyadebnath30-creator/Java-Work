class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName()
                    + " deposited Rs. " + amount + "; balance = Rs. " + balance);
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount <= 0) return;
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName()
                    + " withdrew Rs. " + amount + "; balance = Rs. " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + ": insufficient balance.");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

public class Q19_SynchronizedBank {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(() -> {
            account.deposit(500);
            account.withdraw(200);
        }, "Thread-Deposit");

        Thread t2 = new Thread(() -> {
            account.withdraw(700);
            account.deposit(300);
        }, "Thread-Withdraw");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final balance = Rs. " + account.getBalance());
    }
}
