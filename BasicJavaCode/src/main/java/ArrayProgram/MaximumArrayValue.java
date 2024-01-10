package ArrayProgram;

import java.util.Scanner;

public class MaximumArrayValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, max;
        System.out.print("Enter array size: ");
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of num[" + i + "]: ");
            num[i] = input.nextInt();
        }

        max = num[0];

        for (int i = 0; i < n; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("The maximum value of the array is: " + max);
    }

}
