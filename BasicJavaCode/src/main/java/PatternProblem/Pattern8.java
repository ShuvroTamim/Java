package PatternProblem;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ln, cell;
        System.out.print("Enter the number of line: ");
        ln = input.nextInt();
        
        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= row; col++) {
                cell = row * col;
                System.out.print(cell + " ");
            }
            System.out.println("");
        }
    }
}
