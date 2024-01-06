package PatternProblem;

import java.util.Scanner;

public class PatternD15_Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        System.out.print("Enter the number of line: ");
        ln = input.nextInt();

        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= ln; col++) {
                if (row == 1 || row == ln || col == 1 || col == ln) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
