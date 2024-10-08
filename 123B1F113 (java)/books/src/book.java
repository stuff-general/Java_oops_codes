import java.util.Scanner;
public class book {
    private String name;
    private String author;
    private long price;
    private long ammount;
    private long acc;
    private long num;
    private long balance=5000;
    private String username="Bhagyesh123";
    private long password=12345;


    Scanner sc = new Scanner(System.in);
    public void login(){
        book call=new book();
        System.out.println("Enter the username:");
        String a1=sc.next();
        System.out.println("password:");
        long b1=sc.nextLong();
        if(a1.equals(username) && b1==password){
            System.out.println("Your systsem is logged in");
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter choice :");
            int choice= s1.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Adding of Book");
                    call.add_book();
                    break;
                case 2:
                    System.out.println("Withdrawal of book");
                    call.withdraw();
                    break;

                case 3:
                    System.out.println("Buying of Book");
                    call.buy();
                    break;
                case 4:
                    System.out.println("Reissue the Book");
                    call.reissue();
            }

        }
        else {
            System.out.println("Incorrect username or password");
        }
    }
    public void add_book(){
        System.out.println("Enter the number of books you want to Add:");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Name of book:");
            name = sc.next();
            System.out.println("Enter the name of Author of book:");
            author = sc.next();
            System.out.println("Enter the Price:");
            price = sc.nextLong();
            System.out.println("Enter the Book number:");
            num= sc.nextLong();
            System.out.println("Book is added");
            if(i%2==0){
                System.out.println("book is in rack 1");
            }
            else{
                System.out.println("book is in rack 2");
            }
        }
    }
    public void withdraw(){
        System.out.println("Enter the number of books you want to withdraw:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter the Name of book:");
            name = sc.next();
            System.out.println("Enter the name of Author of book:");
            author = sc.next();
            System.out.println("Enter the Price:");
            price = sc.nextLong();
            System.out.println("Enter the Book number:");
            num = sc.nextLong();
        }
        System.out.println("Your books has been withdraw");
    }
    public void buy(){
        System.out.println("Welcome to our Library!!");
        System.out.println("Enter the book you want:");
        name=sc.next();
        System.out.println("Enter the ammount of book here:");
        long ammount=sc.nextLong();
        System.out.println("Enter the account number:");
        long acc=sc.nextLong();
        System.out.println("Enter the pincode number:");
        long pin=sc.nextLong();
        if(balance>=ammount){
            balance=balance-ammount;
            System.out.println("your ammount has been withdraw");
            System.out.println("Available balance:"+balance);
            System.out.println("Your Book has been purchased");
        }
        else{
            System.out.println("Money not efficient");
            System.out.println("Please Come next time!!");
        }
        System.out.println("Thank you!");
    }
    public void reissue(){
        System.out.println("Welcome to Library");
        System.out.println("Enter the name of the book:");
        String name=sc.next();
        System.out.println("Enter the Book number:");
        long num=sc.nextLong();
        System.out.println("Your book is reissued,Thank you!!");
    }
    public static void main(String[] args) {
        book callin=new book();
        callin.login();

    }
}

