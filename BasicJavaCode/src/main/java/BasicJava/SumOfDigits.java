package BasicJava;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, rem, sum = 0, temp;

        System.out.print("Enter a number: ");
        num = input.nextInt();
        temp = num;

        while (temp != 0) {
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }
        System.out.println(" The sum of the digit is: " + sum);
    }
}
