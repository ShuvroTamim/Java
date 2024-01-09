package ArrayProgram;

public class ArrayDeclarationCreation_2 {

    public static void main(String[] args) {

        int[] num = new int[5];     //  Array Declaration and creation       
        int sum;
        
        num[0] = 2;         // Value Assigning or Array initialization
        num[1] = 12;
        num[2] = 7;
        num[3] = 1;
        num[4] = 14;

        System.out.println("First Value: " + num[0]);
        System.out.println("Second Value: " + num[1]);
        System.out.println("Third Value: " + num[2]);
        System.out.println("Fourth Value: " + num[3]);
        System.out.println("Fifth Value: " + num[4]);
        
        sum = num[0] + num[1] + num[2] + num[3] + num[4];
        System.out.println("Sum of the array value: " + sum);
    }
}
