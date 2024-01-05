package BasicJava;

import java.util.Scanner;

public class SquareSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter last range: ");
        n = input.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i + "^2" + " ");
            sum = sum + i * i;
            i++;
        }
        System.out.println("\nThe result is: " + sum);
    }

}
