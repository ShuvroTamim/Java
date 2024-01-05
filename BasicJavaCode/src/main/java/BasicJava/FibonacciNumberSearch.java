package BasicJava;

import java.util.Scanner;

public class FibonacciNumberSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int frst = 0, scnd = 1, fibo, n, srch, a, b, c;
        a = frst;
        b = scnd;
        System.out.print("Enter your series limit: ");
        n = input.nextInt();

        System.out.print("The fibonacci series is: ");
        System.out.print(frst + " " + scnd + " ");
        for (int i = 3; i <= n; i++) {
            fibo = frst + scnd;
            frst = scnd;
            scnd = fibo;
            System.out.print(fibo + " ");
        }

        System.out.print("\nEnter a position to find nuber from the series: ");
        srch = input.nextInt();

        if (srch == 1) {
            System.out.println("Your " + srch + "th number from the series is: " + a);
        } else if (srch == 2) {
            System.out.println("Your " + srch + "th number from the series is: " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                if (srch == i) {
                    System.out.println("Your " + srch + "th number from the series is: " + c);
                }
            }
        }
    }
}
