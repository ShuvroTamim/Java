package BasicJava;

import java.util.Scanner;

public class Palindromeseries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rem, rev = 0, temp, m, n, count = 0;

        System.out.print("Enter starting number: ");
        m = input.nextInt();
        System.out.print("Enter last number: ");
        n = input.nextInt();

        System.out.print("Palindrome numbers are: ");
        for (int i = m; i <= n; i++) {
            temp = i;

            while (temp != 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }

            if (i == rev) {
                System.out.print(i + " ");
                count++;
            }
            rev = 0;
        }
        System.out.println("\nTotal number of palindrome number is: " + count);
    }

}
