package PatternProblem;

import java.util.Scanner;

public class Pattern7O4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ln, ltr = 64;
        System.out.print("Enter the number of line: ");
        ln = input.nextInt();
        
        for (int row = 1; row <= ln; row++) {
            for (int col = 1; col <= ln; col++) {
                System.out.print((char)(ltr+row) + " ");
            }
            //ltr++;
            System.out.println("");
        }
    }
}
