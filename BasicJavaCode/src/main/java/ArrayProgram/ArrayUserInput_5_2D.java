package ArrayProgram;

import java.util.Scanner;

public class ArrayUserInput_5_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.print("Please enter row size: ");
        m = input.nextInt();
        System.out.print("Please enter column size: ");
        n = input.nextInt();
        
        int[][] num = new int[m][n];

        System.out.println("Enter array values: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("num [%d][%d]: ", row, col);
                num[row][col] = input.nextInt();
            }
        }

        System.out.println("\nTwo Dimensional array is: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(num[row][col] + " ");
            }
            System.out.println("");
        }
    }
    
}
