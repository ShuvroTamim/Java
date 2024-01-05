package PatternProblem;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        System.out.print("Enter line number: ");
        ln = input.nextInt();
        
        for (int row = 1; row <= ln; row++) {
            for (int col = row; col <= ln-1; col++) {       // OR int col = 1; col <= ln-row; col++
                System.out.print("  ");     // Print two space.
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
