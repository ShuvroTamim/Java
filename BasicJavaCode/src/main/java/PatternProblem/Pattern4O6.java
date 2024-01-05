package PatternProblem;

import java.util.Scanner;

public class Pattern4O6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln, ltr = 65;
        System.out.print("Enter the number of line: ");
        ln = input.nextInt();
        
        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= ln-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(ltr) + " ");
            }
            ltr++;
            System.out.println("");
        }
    }

}
