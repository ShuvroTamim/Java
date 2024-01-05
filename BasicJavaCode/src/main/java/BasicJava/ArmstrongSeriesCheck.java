package BasicJava;

import java.util.Scanner;

public class ArmstrongSeriesCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp, rem, sum = 0, m, n, count = 0;

        System.out.print("Enter initial number: ");
        m = input.nextInt();
        System.out.print("Enter last number: ");
        n = input.nextInt();

        System.out.print("Armstrong numner series: ");
        for (int i = m; i <= n; i++) {
            temp = i;
            while (temp != 0) {
                rem = temp % 10;
                sum = sum + rem * rem * rem;
                temp = temp / 10;
            }

            if (i == sum) {
                System.out.print(i + " ");
                count++;
            }
            sum = 0;
        }
        System.out.println("\nTotal armstrong number is: " + count);
    }

}
