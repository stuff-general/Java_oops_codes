import java.lang.*;
import java.util.Scanner;

public class multiple{
    public static void main(String[] args) {
        Manager s2=new Manager();
        s2.display();
    }
}

class Person{
    Scanner sc=new Scanner(System.in);
    String name;
    void  Person(){
        System.out.println("Enter Name:");
        name=sc.next();
    }
}
class Employee extends Person{
    Scanner sc=new Scanner(System.in);
    int employeeid;

    void  Employee(){
        super.Person();
        System.out.println("Enter employee ID:");
        employeeid=sc.nextInt();
    }

}
class Manager extends Employee{
    Scanner sc=new Scanner(System.in);
    String Department;
    Manager(){
        super.Employee();
        System.out.println("Enter Department:");
        Department=sc.next();
    }
    void display(){
        System.out.println("The Name is: "+name);
        System.out.println("The employee ID is:"+employeeid);
        System.out.println("the Department is: "+Department);

    }
}


