package ArrayProgram;

import java.util.Scanner;

public class ArrayUserInput_3_2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[2][3];

        System.out.print("Enter array values: ");
        num[0][0] = input.nextInt();
        num[0][1] = input.nextInt();
        num[0][2] = input.nextInt();
        num[1][0] = input.nextInt();
        num[1][1] = input.nextInt();
        num[1][2] = input.nextInt();

        System.out.println("Two Dimensional array is: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(num[row][col] + " ");
            }
            System.out.println("");
        }
    }

}
