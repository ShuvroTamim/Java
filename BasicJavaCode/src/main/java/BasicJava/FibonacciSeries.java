package BasicJava;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int frst = 0, scnd = 1, fibo, n;
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
    }

}
