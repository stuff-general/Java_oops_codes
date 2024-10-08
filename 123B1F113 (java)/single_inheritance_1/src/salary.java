import java.util.Scanner;
public class salary{

    public static void main(String[] args) {
        manager m1 = new manager();
        m1.calculateSalary();
    }
}
class employee {
    String name;
    int ID;
    int basicsalary=1000;
    double TA;
    double DA;
    double total;
    int bonus;
    Scanner sc = new Scanner(System.in);

    void calculateSalary() {
        TA = (0.5 * basicsalary);
        DA = (0.2 * basicsalary);
        double total = basicsalary + TA + DA;
        System.out.println("Total salary is: " + total);
    }
}
class manager extends employee{
    double total;

    Scanner sc = new Scanner(System.in);

    void calculateSalary(){
        super.calculateSalary();
        double bonus=0.03* basicsalary;
        total = basicsalary + TA + DA+bonus;
        System.out.println("Total salary is: " + total);
    }
}
