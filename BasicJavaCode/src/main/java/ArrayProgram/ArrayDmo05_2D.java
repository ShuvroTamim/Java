package ArrayProgram;

public class ArrayDmo05_2D {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{2,4,2},{7,5,3}};  
        int sum = 0;
        
        System.out.println("Matrix is: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(mat[row][col] + "\t");
            }
            System.out.println("");
        }
        
        // Sum of Diagonal Elements
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sum = sum + mat[row][col];
                }
            }
        }
        System.out.println("\nSum of Diagonal Elements: " + sum);
        
        // Sum of Upper Triangle Elements
        sum = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row < col) {
                    sum = sum + mat[row][col];
                }
            }
        }
        
        System.out.println("\nSum of Upper Triangle Elements: " + sum);
        
        // Sum of Lower Triangle Elements
        sum = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row > col) {
                    sum = sum + mat[row][col];
                }
            }
        }
        
        System.out.println("\nSum of Lower Triangle Elements: " + sum);
    }
    
}
