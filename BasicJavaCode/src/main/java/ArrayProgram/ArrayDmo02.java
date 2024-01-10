package ArrayProgram;

import java.util.Scanner;

public class ArrayDmo02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, sum = 0, len;
        double avg;

        System.out.print("Enter array size: ");
        n = input.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of num[" + i + "]: ");
            num[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = sum + num[i];
        }
        System.out.println("\nThe sum is: " + sum);
        len = num.length;
        System.out.println("The length of the array is: " + len);
        avg = sum / len;
        System.out.println("The average is: " + avg);

    }

}
