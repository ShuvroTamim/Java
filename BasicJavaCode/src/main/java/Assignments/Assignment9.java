package Assignments;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.print("Please enter a digit: ");
        digit = input.nextInt();
        
        switch(digit){
            case 1:
                System.out.println("Selected language is Bengali");
                break;
            case 2:
                System.out.println("Selected language is Hindi");
                break;
            case 3:
                System.out.println("Selected language is Urdu");
                break;
            case 4:
                System.out.println("Selected language is English");
                break;
            default:
                System.out.println("Please select a valid digit");
        }
    }
    
}
