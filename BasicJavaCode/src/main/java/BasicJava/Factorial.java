package BasicJava;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fact = 1;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is: " + fact);
    }

}
