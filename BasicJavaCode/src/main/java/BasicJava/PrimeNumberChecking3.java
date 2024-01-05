package BasicJava;

import java.util.Scanner;

public class PrimeNumberChecking3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, count = 0, totalPrime = 0;
        System.out.print("Enter first number of the series: ");
        m = input.nextInt();
        System.out.print("Enter last number of the series: ");
        n = input.nextInt();

        System.out.print("The prime number series is: ");
        for (int i = m; i <= n; i++) {
            if (i == 0 || i == 1) {
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.print(i + " ");
                    totalPrime++;
                }   // No need of else
                count = 0;
            }
            //count = 0;    //work as same as like line 30
            //System.out.println("\nThe number of total prime is: " + totalPrime);
        }
        System.out.println("\nThe number of total prime is: " + totalPrime);
    }

}
