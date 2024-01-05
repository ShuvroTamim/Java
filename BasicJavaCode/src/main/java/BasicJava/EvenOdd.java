package BasicJava;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.print("The number " + num + " is an Even number.");
        } else {
            System.out.print("The number " + num + " is an odd number.");
        }
    }
}
