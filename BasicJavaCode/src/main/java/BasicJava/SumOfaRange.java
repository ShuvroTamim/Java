package BasicJava;

import java.util.Scanner;

public class SumOfaRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, sum = 0;
        System.out.print("Enter the initial range: ");
        m = input.nextInt();
        System.out.print("Enter the last value: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
    }
}
