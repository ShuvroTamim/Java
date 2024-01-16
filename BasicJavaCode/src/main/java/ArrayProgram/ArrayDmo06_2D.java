package ArrayProgram;

public class ArrayDmo06_2D {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        
        int count = 1;
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                arr[row][col] = count++;
                //count = ++count;
            }
        }
        System.out.println("The matrix is: ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(arr[row][col] + "\t");                
            }
            System.out.println("\n");
        }
    }
    
}
