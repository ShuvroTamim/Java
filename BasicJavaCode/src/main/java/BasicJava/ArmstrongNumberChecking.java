package BasicJava;

import java.util.Scanner;

public class ArmstrongNumberChecking {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, temp, rem, sum = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();
        temp = num;

        while (temp != 0) {
            rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }
        System.out.println("The checked number of " + num + " is: " + sum);
        if (num == sum) {
            System.out.println(num + " is an armstrong number.");
        } else {
            System.out.println(num + " not is an armstrong number.");
        }
    }
}
