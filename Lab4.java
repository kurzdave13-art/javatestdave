import java.util.Scanner;

public class Lab4 {

    static class Account {
        protected int id;
        protected String name;
        protected double balance;
        protected double annualInterestRate;

        public Account() {
            this.id = 0;
            this.name = "NoName";
            this.balance = 0;
            this.annualInterestRate = 0;
        }

        public Account(String name, int id, double balance, double annualInterestRate) {
            this.name = name;
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
        }

        public boolean withdraw(double amount) {
            if (amount <= 0) return false;
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public boolean deposit(double amount) {
            if (amount <= 0) return false;
            balance += amount;
            return true;
        }

        public String toString() {
            return "Account with id " + id + " and owner " + name +
                   " has balance " + String.format("%.2f", balance);
        }
    }

    static class CheckingAccount extends Account {
        private int overdraftLimit;

        public CheckingAccount() {
            super("NoName", 1000, 0, 0);
            this.overdraftLimit = 0;
        }

        public CheckingAccount(String name, int id, double balance,
                               double annualInterestRate, int overdraftLimit) {
            super(name, id, balance, annualInterestRate);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public boolean withdraw(double amount) {
            if (amount <= 0) return false;
            if (balance - amount >= -overdraftLimit) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public boolean transfer(Account act, double amt) {
            if (withdraw(amt)) {
                act.deposit(amt);
                return true;
            }
            return false;
        }

        public String toString() {
            return "Checking account with id " + id + " and owner " + name +
                   " has balance " + String.format("%.2f", balance) +
                   " and overdraft limit " + overdraftLimit + ".";
        }
    }

    static class SavingsAccount extends Account {
        private double monthlyWithdrawalAmountLimit;
        private int monthlyWithdrawalTimesLimit;
        private double currentMonthWithdrawalAmount;
        private int currentMonthWithdrawalTimes;

        public SavingsAccount() {
            super("NoName", 2000, 0, 0);
            this.monthlyWithdrawalAmountLimit = 0;
            this.monthlyWithdrawalTimesLimit = 0;
            this.currentMonthWithdrawalAmount = 0;
            this.currentMonthWithdrawalTimes = 0;
        }

        public SavingsAccount(String name, int id, double balance,
                              double annualInterestRate,
                              double monthlyWithdrawalAmountLimit,
                              int monthlyWithdrawalTimesLimit) {
            super(name, id, balance, annualInterestRate);
            this.monthlyWithdrawalAmountLimit = monthlyWithdrawalAmountLimit;
            this.monthlyWithdrawalTimesLimit = monthlyWithdrawalTimesLimit;
            this.currentMonthWithdrawalAmount = 0;
            this.currentMonthWithdrawalTimes = 0;
        }

        @Override
        public boolean withdraw(double amount) {
            if (amount <= 0) return false;
            if (amount > balance) return false;
            if (currentMonthWithdrawalAmount + amount > monthlyWithdrawalAmountLimit) return false;
            if (currentMonthWithdrawalTimes + 1 > monthlyWithdrawalTimesLimit) return false;

            balance -= amount;
            currentMonthWithdrawalAmount += amount;
            currentMonthWithdrawalTimes++;
            return true;
        }

        public boolean transfer(Account act, double amt) {
            if (withdraw(amt)) {
                act.deposit(amt);
                return true;
            }
            return false;
        }

        public String toString() {
            return "Savings account with id " + id + " and owner " + name +
                   " has balance " + String.format("%.2f", balance) +
                   ", monthly withdrawal amount limit " +
                   String.format("%.2f", monthlyWithdrawalAmountLimit) +
                   " and monthly withdrawal times limit " +
                   monthlyWithdrawalTimesLimit + ".";
        }
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide number of accounts.");
            return;
        }

        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for account " + (i + 1) + ":");
            System.out.print("type (C/S): ");
            String type = input.next();
            input.nextLine();

            System.out.print("owner: ");
            String owner = input.nextLine();

            System.out.print("id: ");
            int id = input.nextInt();

            System.out.print("initial balance: ");
            double bal = input.nextDouble();

            System.out.print("annual interest rate: ");
            double rate = input.nextDouble();

            if (type.equalsIgnoreCase("C")) {
                System.out.print("overdraft limit: ");
                int limit = input.nextInt();
                accounts[i] = new CheckingAccount(owner, id, bal, rate, limit);
            } else {
                System.out.print("monthly withdrawal amount limit: ");
                double amtLimit = input.nextDouble();

                System.out.print("monthly withdrawal times limit: ");
                int timesLimit = input.nextInt();

                accounts[i] = new SavingsAccount(owner, id, bal, rate, amtLimit, timesLimit);
            }

            System.out.println();
        }

        System.out.print("How many withdrawals/deposits do you want to perform? ");
        int wdCount = input.nextInt();

        for (int i = 0; i < wdCount; i++) {
            System.out.println("Enter information for W/D " + (i + 1) + ":");
            System.out.print("type: ");
            String type = input.next();

            System.out.print("id: ");
            int id = input.nextInt();

            System.out.print("amount: ");
            double amt = input.nextDouble();

            Account act = findAccount(accounts, id);
            if (act != null) {
                if (type.equalsIgnoreCase("D")) act.deposit(amt);
                else if (type.equalsIgnoreCase("W")) act.withdraw(amt);
            }
        }

        System.out.print("How many transfers do you want to perform? ");
        int tCount = input.nextInt();

        for (int i = 0; i < tCount; i++) {
            System.out.println("Enter information for transfer " + (i + 1) + ":");

            System.out.print("Source account id: ");
            int srcId = input.nextInt();

            System.out.print("Destination account id: ");
            int dstId = input.nextInt();

            System.out.print("amount: ");
            double amt = input.nextDouble();

            Account src = findAccount(accounts, srcId);
            Account dst = findAccount(accounts, dstId);

            if (src != null && dst != null) {
                if (src instanceof CheckingAccount)
                    ((CheckingAccount) src).transfer(dst, amt);
                else
                    ((SavingsAccount) src).transfer(dst, amt);
            }
        }

        System.out.println("After all transactions, the accounts with their balances are:");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    private static Account findAccount(Account[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].id == id) return arr[i];
        }
        return null;
    }
}
