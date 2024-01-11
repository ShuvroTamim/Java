package ArrayProgram;

import java.util.Scanner;

public class ArrayUserInput_6_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m, n;
        System.out.print("Enter row limit: ");
        m = input.nextInt();
        System.out.print("Enter column limit: ");
        n = input.nextInt();
        
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        
        System.out.println("\nEnter matrix A entry: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("A[%d][%d]: ", row, col);
                a[row][col] = input.nextInt();
            }
        }
        
        System.out.println("\nEnter matrix B entry: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("B[%d][%d]: ", row, col);
                b[row][col] = input.nextInt();
            }
        }
        
        System.out.println("\nMatrix A: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nMatrix B: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(b[row][col] + " ");
            }
            System.out.println("");
        }
        
    }    
}
