package PatternProblem;

import java.util.Scanner;

public class Pattern3O7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln, ltr = 64;

        System.out.print("Enter line number: ");
        ln = input.nextInt();

        for (int row = ln; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {                
                System.out.print((char) (ltr + row) + " ");
            }
            System.out.println("");
        }
    }

}
