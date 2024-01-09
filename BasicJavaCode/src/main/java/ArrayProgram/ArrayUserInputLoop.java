package ArrayProgram;

import java.util.Scanner;

public class ArrayUserInputLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        double len, sum, avg;               
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number for num[" + i + "]: ");
            num[i] = input.nextDouble();
        }
        
        System.out.println("");
        System.out.println("First Value: " + num[0]);
        System.out.println("Second Value: " + num[1]);
        System.out.println("Third Value: " + num[2]);
        System.out.println("Fourth Value: " + num[3]);
        System.out.println("Fifth Value: " + num[4]);
        
        len = num.length;
        System.out.println("\nThe length of the array: " + len);
        
        sum = num[0] + num[1] + num[2] + num[3] + num[4];
        System.out.println("\nThe sum of the array is: " + sum);
        
        avg = sum/len;
        System.out.println("The average of the array value is: " + avg);
        
    }
    
}
