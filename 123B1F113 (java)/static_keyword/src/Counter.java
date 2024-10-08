//java program to create a class counter with a static variable count,
// implement a constructor that increments the count every time,
//and object is created. Print, the value of count after creating, several objects.

import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();

        System.out.println("Number of Counter objects: " + Counter.getCount());
    }

    static int count=0;

        public Counter() {
            count++;
        }

        public static int getCount() {
            return count;
        }

    }



