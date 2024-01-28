package JavaMethods;

import java.util.Scanner;

public class CreateUSerDefinedMethod_01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        findEvenOdd(num);
    }
    
    public static void findEvenOdd(int num){
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even.");
        }
        else
            System.out.println("The number " + num + " is odd.");
    }
    
}
