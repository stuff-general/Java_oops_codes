//Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, CurrentAccount.
// The bank should have a list of accounts and methods for adding them.
// Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
// SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
import java.util.Scanner;

interface Accounts{
    double deposit();
    double withdraw();
    double calculateinterest();
    double viewbalance();
}
class SavingsAccount implements Accounts{
    @Override
    public double deposit() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit:");
        double deposit=sc.nextDouble();
        System.out.println("Your amount is deposited!");
    }

    @Override
    public double withdraw() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        double withdraw=sc.nextDouble();
        System.out.println("The amount has been withdrawn!");
    }

    @Override
    public double calculateinterest(){
        Scanner sc=new Scanner(System.in);
        double interest=sc.nextDouble();
        interest = balance/100;
        System.out.println("Your amount is deposited!");
    }

}

class CurrentAccount implements Accounts{
    @Override
    public double deposit() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit:");
        double deposit=sc.nextDouble();
        System.out.println("Your amount is deposited!");
    }

    @Override
    public double withdraw() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        double withdraw=sc.nextDouble();
        System.out.println("The amount has been withdrawn!");
    }
}






public class Interface2 {
}
