import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        City1 object = new City1();
        object.input();
        object.display();
    }
}

class City1 {
    Scanner sc = new Scanner(System.in);

    String[] name1 = new String[5];
    long[] ppl1 = new long[5];

    void input() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of city " + (i + 1) + ":");
            name1[i] = sc.next();
            System.out.println("Enter the population of city " + (i + 1) + ":");
            ppl1[i] = sc.nextLong();
        }
    }
    void display(){
    }
}