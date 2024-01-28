package JavaMethods;

import java.util.Scanner;

public class CreateUSerDefinedMethod_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        System.out.print("Enter the value of n1: ");
        n1 = input.nextInt();
        System.out.print("Enter the value of n2: ");
        n2 = input.nextInt();

        //method calling
        add(n1, n2);    //n1 and n2 are actual parameters 
    }

    public static void add(int a, int b) {  //a and b are formal parameters 
        int sum;
        sum = a + b;  
        System.out.println("The sum is: " + sum);
    }

}
