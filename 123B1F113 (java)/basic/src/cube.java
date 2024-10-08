import java.util.Scanner;
public class cube {
    public static void main(String[] args) {

        int a,cube;
        Scanner object=new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=object.nextInt();
        cube=a*a*a;
        System.out.println("The cube of a is: "+cube);
    }
}
