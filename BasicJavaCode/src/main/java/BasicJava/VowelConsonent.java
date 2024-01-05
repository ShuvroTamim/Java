package BasicJava;

import java.util.Scanner;

public class VowelConsonent {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);

        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e'
                || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u') {
            System.out.println("\"" + ch + "\"" + " is a vowel.");
        } else {
            System.out.println("\"" + ch + "\"" + " is a consonent.");
        }
    }
}
