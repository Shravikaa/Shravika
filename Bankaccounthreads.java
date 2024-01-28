package threadsassignment;

public class Bankaccounthreads {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread depositThread = new Thread(new DepositRunnable(account));
        Thread withdrawThread = new Thread(new WithdrawRunnable(account));
        depositThread.start();
        withdrawThread.start();
        System.out.println("Final Balance: "+ account.getBalance());
    }

static class DepositRunnable implements Runnable {
        private final BankAccount account;
        public DepositRunnable(BankAccount account) {
            this.account = account;
        }
        @Override
        public void run() {
        	account.deposit(100);
        }
    }

static class WithdrawRunnable implements Runnable {
    	
        private final BankAccount account;
        public WithdrawRunnable(BankAccount account) {
            this.account = account;
        }
        @Override
        public void run() {
        	account.withdraw(50);
        }
    }
static class BankAccount {
        private int balance = 0;

        public synchronized void deposit(int amount) {
            int currentBalance = balance;
            int newBalance = currentBalance + amount;
            balance = newBalance;
            System.out.println("Deposit: " + amount + ", New Balance: " + balance);
        }

        public synchronized void withdraw(int amount) {
            int currentBalance = balance;
            if (currentBalance >= amount) {
                int newBalance = currentBalance - amount;
                balance = newBalance;
                System.out.println("Withdrawal: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Insufficient funds for withdrawal: " + amount);
            }
        }
        public int getBalance() {
            return balance;
        }
    }
}