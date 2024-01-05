package BasicJava;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, sum = 0;
        System.out.print("Enter the initial value: ");
        m = input.nextInt();
        System.out.print("Enter the last value: ");
        n = input.nextInt();

        System.out.print("Odd numbers are: ");
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.print(i + ",");
            }
        }
        System.out.println("\nThe sum is: " + sum);
    }
}
