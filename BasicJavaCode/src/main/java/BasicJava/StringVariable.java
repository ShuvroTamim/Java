package BasicJava;

import java.util.Scanner;

public class StringVariable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        System.out.print("Enter Your name: ");
        str = input.nextLine();  //For showing the full name after first space
        System.out.println("Welcome \"" + str + "\"");
        System.out.println("Here name length is: " + str.length());
        System.out.println("Name in Uppercase letter: " + str.toUpperCase());
        System.out.println("Name in Lowercase letter: " + str.toLowerCase());
        System.out.println("The index of letter S is: " + str.indexOf('S'));
    }

}
