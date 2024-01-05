package BasicJava;

import java.util.Scanner;

public class PosNegZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("The number " + num + " is ");

        if (num > 0) {
            System.out.println("Positive.");
        } else if (num < 0) {
            System.out.println("Negative.");
        } else {
            System.out.println("Non-negative or Zero.");
        }
    }

}
