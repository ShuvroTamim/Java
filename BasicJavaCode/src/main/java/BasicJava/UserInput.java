package BasicJava;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fname, lname;
        int age;

        System.out.print("Enter your first name: ");
        fname = input.next();
        System.out.println("First name is: " + fname);

        System.out.print("Enter your last name: ");
        lname = input.next();
        System.out.println("Last name is: " + lname);

        System.out.println("Your full name is: " + fname + " " + lname);

        /*System.out.print("Enter your full name: ");
        full_Name = input.nextLine();
        System.out.println("Your name is: " + full_Name);*/
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.println("Your age is = " + age);

    }

}
