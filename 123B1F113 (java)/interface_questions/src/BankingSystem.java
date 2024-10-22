//Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, CurrentAccount.
// The bank should have a list of accounts and methods for adding them.
// Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
// SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
import java.util.Scanner;

interface Accounts {
    int Deposit(int deposit);
    int withdrawal(int amount);
    int Display_balance(int deposit, int amount);
    double interest(double value);
}

class Savings_account implements Accounts {
    @Override
    public int Deposit(int deposit) {
        System.out.println("Deposited amount: " + deposit);
        return deposit;
    }

    @Override
    public int withdrawal(int amount) {
        System.out.println("Withdrawn amount: " + amount);
        return amount;
    }

    @Override
    public int Display_balance(int deposit, int amount) {
        return deposit - amount;
    }

    @Override
    public double interest(double value) {
        return value * (0.01);
    }
}

class Current_account implements Accounts {
    @Override
    public int Deposit(int deposit) {
        System.out.println("Deposited amount: " + deposit);
        return deposit;
    }

    @Override
    public int withdrawal(int amount) {
        System.out.println("Withdrawn amount: " + amount);
        return amount;
    }

    @Override
    public int Display_balance(int deposit, int amount) {
        return deposit - amount;
    }

    @Override
    public double interest(double value) {
        return value * (0.01);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        int deposit = scanner.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int amount = scanner.nextInt();

        System.out.print("Enter amount for interest calculation: ");
        double interestAmount = scanner.nextDouble();

        Accounts savingsAccount = new Savings_account();
        Accounts currentAccount = new Current_account();

        displaymethods(savingsAccount, deposit, amount, interestAmount);
        displaymethods(currentAccount, deposit, amount, interestAmount);

        scanner.close();
    }

    public static void displaymethods(Accounts account, int deposit, int amount, double interestAmount) {
        int displayDeposit = account.Deposit(deposit);
        int displayWithdrawal = account.withdrawal(amount);
        double displayInterest = account.interest(interestAmount);
        int displayBalance = account.Display_balance(displayDeposit, displayWithdrawal);

        System.out.println("Current balance in " + account.getClass().getSimpleName() + " is " + displayBalance);
        System.out.println("Interest calculated on " + interestAmount + " is " + displayInterest);
    }
}