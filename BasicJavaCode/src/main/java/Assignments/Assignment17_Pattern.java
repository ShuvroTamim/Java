package Assignments;

import java.util.Scanner;

public class Assignment17_Pattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        System.out.print("Enter the number of line: ");
        ln = input.nextInt();

        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col % 2 + " ");
            }
            System.out.println("");
        }
    }
}
