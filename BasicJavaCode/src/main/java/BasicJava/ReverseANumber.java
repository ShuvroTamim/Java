package BasicJava;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, rem, rev = 0, temp;

        System.out.print("Enter a number: ");
        num = input.nextInt();
        temp = num;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println("The reverse of " + num + " is: " + rev);
    }
}
