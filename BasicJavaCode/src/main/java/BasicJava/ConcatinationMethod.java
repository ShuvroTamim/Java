package BasicJava;

import java.util.Scanner;

public class ConcatinationMethod {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String fname, lname;

        System.out.print("Enter your first name: ");
        fname = input.next();
        System.out.println("First name is: " + fname);

        System.out.print("Enter your last name: ");
        lname = input.next();
        System.out.println("Last name is: " + lname);

        System.out.println("Your full name is: " + fname.concat(lname));
    }
}
