package ArrayProgram;

public class ArrayDmo07_2D {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int count = 1;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == col || row > col) {
                    arr[row][col] = count++;
                }
            }                        
            
        }
        
        System.out.println("The triangle is: ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == col || row > col) {
                    System.out.print(arr[row][col] + "\t");
                }                
            }
            System.out.println("\n");
            
        }
    }
    
}
