package ArrayProgram;

import java.util.Scanner;

public class ArrayDmo04_2D_Mul_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, l;
        System.out.print("Enter value for m: ");
        m = input.nextInt();
        System.out.print("sEnter value for n: ");
        n = input.nextInt();
        System.out.print("Enter value for l: ");
        l = input.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[n][l];
        int[][] mul = new int[m][l];

        System.out.printf("Enter %d number for Matrix A: ", m * n);
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                A[row][col] = input.nextInt();
            }
        }
        System.out.printf("Enter %d number for Matrix B: ", n * l);
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < l; col++) {
                B[row][col] = input.nextInt();
            }
        }

        System.out.println("\nMatrix A: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(A[row][col] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nMatrix B: ");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < l; col++) {
                System.out.print(B[row][col] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nMultiplication Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    mul[i][j] = mul[i][j] + A[i][k] * B[k][j];
                }
                System.out.print(mul[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
