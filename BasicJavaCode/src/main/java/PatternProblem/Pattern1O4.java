package PatternProblem;

import java.util.Scanner;

public class Pattern1O4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ln;
        System.out.print("Enter line number: ");
        ln = input.nextInt();
        
        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row % 2 + " ");
            }
            System.out.println("");
        }
    }    
}
