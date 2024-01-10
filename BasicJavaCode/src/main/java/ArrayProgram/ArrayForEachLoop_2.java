package ArrayProgram;

public class ArrayForEachLoop_2 {
    public static void main(String[] args) {
        int[] num = {20,17,19,27,13,41,56,8};
        int sum = 0;
                
        for (int var : num) {
            sum = sum + var;
        }
        System.out.println("The sum of the array is: " + sum);
    }
    
}
