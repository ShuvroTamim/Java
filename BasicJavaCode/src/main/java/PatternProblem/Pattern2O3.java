package PatternProblem;

import java.util.Scanner;

public class Pattern2O3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        System.out.print("Enter number of line: ");
        ln = input.nextInt();

        for (int row = ln; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print( col%2 + " ");       //For serial number                
            }
            System.out.println("");
        }
    }    
}
