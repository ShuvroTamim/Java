package BasicJava;

import java.util.Scanner;

public class BitwiseOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result, rShift, lShift;  //32 and 12

        System.out.print("Enter your first number: ");
        num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        num2 = input.nextInt();

        result = num1 & num2;   //AND
        System.out.println("Num1 & Num2= " + result);
        result = num1 | num2;   //OR
        System.out.println("Num1 | Num2= " + result);
        result = num1 ^ num2;   //X-OR
        System.out.println("Num1 ^ Num2= " + result);
        rShift = num1 >> 2;     //Right Shift
        System.out.println("Right shift of Num1 is= " + rShift);
        lShift = num2 << 3;     //Left Shift
        System.out.println("Left Shift of Num2 is= " + lShift);
    }

}
