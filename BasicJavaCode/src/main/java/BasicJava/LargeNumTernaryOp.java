package BasicJava;

import java.util.Scanner;

public class LargeNumTernaryOp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        System.out.print("Enter your first num: ");
        num1 = input.nextInt();
        System.out.print("Enter your second num: ");
        num2 = input.nextInt();

        large = (num1 > num2) ? num1 : num2;
        System.out.println("The large number is: " + large);
    }

}
