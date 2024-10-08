import java.util.Scanner;

public class Main {
    static void display(){

        int age;
        String name;
        Scanner object=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=object.next();
        System.out.println("Enter your age");
        age=object.nextInt();
        System.out.println("Your name and age are: "+name+age);
    }
    public static void main(String[] args) {
        display();
    }
}