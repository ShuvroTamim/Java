package ArrayProgram;

public class ArrayDeclarationCreation_4_2D {
    public static void main(String[] args) {
        int[][] num = new int[2][3];            //  Array Declaration & Array Creation
        
        num[0][0] = 10;         // Value Assigning or Array initialization
        num[0][1] = 20;
        num[0][2] = 30;
        num[1][0] = 40;
        num[1][1] = 50;
        num[1][2] = 60;
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(num[row][col] + " ");
            }
            System.out.println("");
        }
    }
    
}
