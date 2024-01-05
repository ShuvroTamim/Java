package PatternProblem;

import java.util.Scanner;

public class Pattern2O5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        char ch = 'A';
        System.out.print("Enter line number: ");
        ln = input.nextInt();

        for (int row = ln; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch++ + " ");
            }
            ch = 'A';
            System.out.println("");
        }
    }

}
