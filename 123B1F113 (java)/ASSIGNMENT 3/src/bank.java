import java.util.Scanner;
public class bank {
    private long acc;
    private String name;
    private long mobile;
    private long balance=50000;

    public void add_acc(){


    }
    public void withdraw(){
        System.out.println("Withdrawal of Money");
        System.out.println("Enter your account number:");
        acc=sc.nextLong();
        System.out.println("Enter the amount you want to withdraw:");
        long ammount=sc.nextLong();
        if(balance>=ammount){
            balance=balance-ammount;
            System.out.println("your amount has been withdrawn");
            System.out.println("Available balance:"+balance);
        }
        else{
            System.out.println("Money not efficient");
        }
    }
    public void deposit(){
        System.out.println("Deposition of money");
        System.out.println("Enter the money you want to deposit:");
        long deposit=sc.nextLong();
        balance=balance+deposit;
        System.out.println("your money has been deposited,Thank you!!");
        System.out.println("Available balance:"+balance);
    }
    public void remove(){
        System.out.println("Removal of account");
        System.out.println("Enter your mobile number:");
        mobile=sc.nextLong();
        System.out.println("Your account has been removed,Get lost!!");
    }
    public static void main(String[] args) {
        bank call=new bank();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add account");
        System.out.println("2.Remove Account");
        System.out.println("3.Withdraw money");
        System.out.println("4.Deposit money");
        System.out.println("Enter your choice:");
        int choice= sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Adding account:");
                System.out.println("Enter the Name:");
                String name=sc.next();
                System.out.println("Enter the account number:");
                long acc=sc.nextLong();
                System.out.println("Enter the mobile number:");
                long mobile=sc.nextLong();
                call.add_acc();

                break;
            case 2:
                call.remove();
                break;

            case 3:
                call.withdraw();
                break;
            case 4:
                call.deposit();
                break;
        }

    }
}