package PatternProblem;

import java.util.Scanner;

public class Pattern3O4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        char ch = 'A';
        System.out.print("Enter line number; ");
        ln = input.nextInt();

        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println("");
        }
        for (int row = ln - 1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println("");
        }
    }

}
