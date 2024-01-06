package PatternProblem;

import java.util.Scanner;

public class Pattern7O2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        System.out.print("Enter the number of line: ");
        ln = input.nextInt();
        
        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= ln; col++) {
                System.out.print(row + " ");
            }
            System.out.println("");
        }
    }
}
