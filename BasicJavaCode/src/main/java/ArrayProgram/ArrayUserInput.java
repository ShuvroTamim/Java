package ArrayProgram;

import java.util.Scanner;

public class ArrayUserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] num = new double[5];
        double len, sum, avg;
        
        System.out.print("Enter five number: ");
        num[0] = input.nextDouble();
        num[1] = input.nextDouble();
        num[2] = input.nextDouble();
        num[3] = input.nextDouble();
        num[4] = input.nextDouble();
        
        System.out.println("First Value: " + num[0]);
        System.out.println("Second Value: " + num[1]);
        System.out.println("Third Value: " + num[2]);
        System.out.println("Fourth Value: " + num[3]);
        System.out.println("Fifth Value: " + num[4]);
        
        len = num.length;
        System.out.println("The length of the array: " + len);
        
        sum = num[0] + num[1] + num[2] + num[3] + num[4];
        System.out.println("The sum of the array is: " + sum);
        
        avg = sum/len;
        System.out.println("The average of the array value is: " + avg);
        
    }
}
