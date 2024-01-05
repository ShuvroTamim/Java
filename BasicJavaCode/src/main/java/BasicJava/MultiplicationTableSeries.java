package BasicJava;

import java.util.Scanner;

public class MultiplicationTableSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, num, mul;
        System.out.print("Enter a number for first table: ");
        m = input.nextInt();
        System.out.print("Enter a number for last table: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.println("\nMultiplication table of " + i + " is:");
            for (int j = 1; j <= 10; j++) {
                mul = i * j;
                System.out.println(i + " x " + j + "  = " + mul);
            }
        }
    }
}
