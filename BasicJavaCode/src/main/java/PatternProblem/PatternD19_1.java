package PatternProblem;

import java.util.Scanner;

public class PatternD19_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        System.out.print("Enter the number of line: ");
        ln = input.nextInt();

        for (int row = ln; row >= 1; row--) {
            for (int col = 1; col <= ln - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            for (int col = row-1; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
    
}
