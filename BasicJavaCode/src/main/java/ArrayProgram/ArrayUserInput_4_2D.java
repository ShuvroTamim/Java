package ArrayProgram;

import java.util.Scanner;

public class ArrayUserInput_4_2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[2][3];

        System.out.println("Enter array values: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("num [" + row + "][" + col + "]: ");
                num[row][col] = input.nextInt();
            }
        }

        System.out.println("Two Dimensional array is: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(num[row][col] + " ");
            }
            System.out.println("");
        }
    }

}
