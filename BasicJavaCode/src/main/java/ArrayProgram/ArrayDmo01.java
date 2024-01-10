package ArrayProgram;

import java.util.Scanner;

public class ArrayDmo01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value of num[" + i + "]: ");
            num[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            sum = sum + num[i];
        }
        System.out.println("The total sum is: " + sum);
    }
}
