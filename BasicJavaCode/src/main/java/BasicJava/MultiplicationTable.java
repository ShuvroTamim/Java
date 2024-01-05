package BasicJava;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, mul;
        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.println("Multiplication table of " + num + " is:");
        for (int i = 1; i <= 10; i++) {
            mul = num * i;
            System.out.println(num + " x " + i + "  = " + mul);
        }
    }

}
