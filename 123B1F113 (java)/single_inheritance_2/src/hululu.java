import java.util.Scanner;
public class hululu {
    public static void main(String[] args) {
        student s1=new student();
        s1.student();
    }
}
class person {
    String name;
    int age;
    int ID;
    Scanner sc = new Scanner(System.in);
    void student(){
        System.out.println("Enter name: ");
        name=sc.next();
        System.out.println("Enter age: ");
        age=sc.nextInt();
    }
}
class student extends person{
    void student(){
        super.student();
        System.out.println("Enter ID: ");
        ID = sc.nextInt();
    }
}