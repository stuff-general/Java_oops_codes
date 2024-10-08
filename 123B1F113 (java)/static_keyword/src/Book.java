//Write a Java program to manage a library's book lending system.
// The program should use static variables and static methods to keep track of the
//total number of books lent and display the lending statistics. Each book and
//lending transaction will be represented by instances of a Book class, but the
//total count of books lent out should be maintained as a static variable.

import java.util.Scanner;
public class Book {
    public static void main(String[] args) {
        library l1 = new library();
        l1.add_book("book1", 1);
        l1.add_book("book2", 3);
        l1.remove_book("book2", 1);
        l1.display();
    }
}
    class library {
        static int total_books = 0;

        void add_book(String name, int no) {
            total_books += no;
        }

        void remove_book(String name, int no) {
            total_books -= no;
        }

        void display() {
            System.out.println(total_books);
        }
    }
