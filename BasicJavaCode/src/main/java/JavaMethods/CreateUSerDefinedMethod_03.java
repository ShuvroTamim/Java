package JavaMethods;

import java.util.Scanner;

public class CreateUSerDefinedMethod_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, sum;
        System.out.print("Enter the value of n1: ");
        n1 = input.nextInt();
        System.out.print("Enter the value of n2: ");
        n2 = input.nextInt();
        
        //Mehtod calling
        sum = add(n1,n2);   //n1 and n2 are actual parameters
        System.out.println("The sum is: " + sum);
    }
    
    public static int add(int val1, int val2){  // val1 and val2 are formal parameters
        int rslt;
        rslt = val1 + val2;
        return rslt;    //returning the sum 
    }
    
}
