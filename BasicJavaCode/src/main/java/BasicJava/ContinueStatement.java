package BasicJava;

import java.util.Scanner;

public class ContinueStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
