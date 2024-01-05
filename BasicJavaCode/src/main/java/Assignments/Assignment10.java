package Assignments;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The result is: " + sum);
    }
    
}
