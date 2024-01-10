package ArrayProgram;

public class ArrayDeclarationCreation_3_2D {
    public static void main(String[] args) {
        int[][] num;            //  Array Declaration
        num = new int[2][3];    // Array Creation
        
        num[0][0] = 10;         // Value Assigning or Array initialization
        num[0][1] = 20;
        num[0][2] = 30;
        num[1][0] = 40;
        num[1][1] = 50;
        num[1][2] = 60;
        
        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);
        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);
    }
    
}
