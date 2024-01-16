package ArrayProgram;

public class ArrayDmo07_2D_2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][];     // Row number must be initiated
        arr[0] = new int[1];     // In row 1 number of column will be 1
        arr[1] = new int[2];     // In row 2 number of column will be 2
        arr[2] = new int[3];     // In row 3 number of column will be 3
        arr[3] = new int[4];     // In row 4 number of column will be 4
        
        int count = 1;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row+1; col++) {
                arr[row][col] = count++;
            }
        }
        
        System.out.println("The triangle is: ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println("\n");
        }
    }
    
}
