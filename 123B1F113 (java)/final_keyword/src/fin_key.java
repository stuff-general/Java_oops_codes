// this program will show an error cuz we have used the final keyword
// which makes the particular variable or method or class such that we can't change it or override it.
//We can't initialise final variable in main method but can in a constructor of a class.

import java.util.Scanner;
public class fin_key {
    public static void main(String[] args) {
        fin_key obj = new fin_key();
        obj.x = 20;
        System.out.println(obj.x);
    }
    final int x=40;

}
