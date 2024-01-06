package PatternProblem;

import java.util.Scanner;

public class PatternD18_FloydsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln, count = 1;
        System.out.print("Enter the number of line: ");
        ln = input.nextInt();

        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count++ + " ");
            }
            System.out.println("");
        }
    }
    
}
