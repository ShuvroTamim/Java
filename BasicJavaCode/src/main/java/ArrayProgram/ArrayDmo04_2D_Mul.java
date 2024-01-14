package ArrayProgram;

public class ArrayDmo04_2D_Mul {
    public static void main(String[] args){
        int[][] A = {{1,2,3},{2,4,2}};                
        int[][] B = {{1,2},{1,2},{1,2}};
        int[][] mul = new int[2][2];
        
        System.out.println("Matrix A: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(A[row][col] + "\t ");
            }
            System.out.println("");
        }
        System.out.println("\nMatrix B: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(B[row][col] + "\t ");
            }
            System.out.println("");
        }
        
        System.out.println("\nMultiplication Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mul[i][j] = 0;      // 0 assigned for summation
                for (int k = 0; k < 3; k++) {
                    mul[i][j] = mul[i][j] + A[i][k]*B[k][j];
                }
                System.out.print(mul[i][j] + "\t ");                
            }
            System.out.println("");
        }
    }
}
