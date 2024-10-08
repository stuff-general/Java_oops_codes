import java.lang.String;
public class Main {
    public static void main(String[] args) {
        String str= new String("SHARWARI");
        String str1= new String("KATHOLE");

        int length= str.length();
        System.out.println("The length of the string is: "+length);

        char ch=str.charAt(3);
        System.out.println("The character at index 3 is: "+ch);


        System.out.println("The substring from index 4 is: "+str.substring(4));

        boolean empty= str.isEmpty();
        boolean empty1= str1.isEmpty();
        System.out.println("The first string is empty: "+empty);
        System.out.println("The second string is empty: "+empty1);

        int index= str.indexOf("W");
        int index1= str1.indexOf("H");
        System.out.println("The index of the character W in first string is: "+index);
        System.out.println("The index of the character H in second string is: "+index1);


        boolean equals= str.equals(str1);
        if(str.equals(str1)){
            equals=true;
            System.out.println("The two strings are equal: "+equals);
        }
        else {
            equals=false;
            System.out.println("The two strings are equal: "+equals);
        }

        String lower= str.toLowerCase();
        String lower1= str1.toLowerCase();
        System.out.println("The first string in lower case is: "+lower);
        System.out.println("The second string in lower case is: "+lower1);


        }
    }
