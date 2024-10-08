import java.util.Scanner;
public class addition {
    public static void main(String[] args) {

        int a,b,sum;
        Scanner object=new Scanner(System.in);
            System.out.println("Enter a number: ");
            a=object.nextInt();
            System.out.println("Enter a number: ");
            b=object.nextInt();
            sum=a+b;
            System.out.println("The sum of a and b is: "+sum);
        }
    }
