package ArrayProgram;

import java.util.Scanner;

public class MinimumArrayValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, min;
        System.out.print("Enter array size: ");
        n = input.nextInt();

        int[] num = new int[n];
        System.out.print("Please enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {            
            num[i] = input.nextInt();
        }

        min = num[0];

        for (int i = 0; i < n; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("The minimum value of the array is: " + min);
    }

}
