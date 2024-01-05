package Assignments;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Do you love java?: ");
        ch = input.next().charAt(0);
        
        if (ch == 'Y' || ch == 'y') {
            System.out.println("You are a java lover.");
        }
        else if (ch == 'N' || ch == 'n') {
            System.out.println("You are not a java lover.");
        }
        else {
            System.out.println("Please type a right keyword.");
        }
    }
}
