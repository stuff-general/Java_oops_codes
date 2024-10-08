import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Person p1= new Person();
        Person p2= new Person();
        p1.accept();
        p2.accept();
        p1.display();
        p2.display();
        }
}
        class Person {
            Scanner sc = new Scanner(System.in);

            int age;
            String name;
            int basicpay;
            double hra;
            double da;
            double tax;
            double net;
            double gross;
            String job;

            void accept() {
                System.out.println("Enter your name: ");
                name = sc.nextLine();
                System.out.println("Enter your age: ");
                age = sc.nextInt();
                System.out.println("Enter your basic pay: ");
                basicpay = sc.nextInt();
                System.out.println("Enter your job: ");
                job = sc.next();
                hra = 0.05 * basicpay;
                da = 0.1 * basicpay;
                net = hra + da + basicpay;
                tax = 0.02 * basicpay;
                gross = net - tax;
            }

            void display() {
                System.out.println("Your name is: " + name);
                System.out.println("Your age is: " + age);
                System.out.println("Your hra is: " + hra);
                System.out.println("Your da is: " + da);
                System.out.println("Your tax is: " + tax);
                System.out.println("Your salary is: " + gross);
                System.out.println("Your job is: " + job);
            }
        }
