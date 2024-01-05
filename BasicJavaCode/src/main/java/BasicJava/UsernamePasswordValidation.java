package BasicJava;

import java.util.Scanner;

public class UsernamePasswordValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passWord, uName, uPass;
        userName = "Tamim";
        passWord = "tamim123";

        for (int i = 1; i <= 2; i++) {
            System.out.print("Please enter your username: ");
            uName = input.next();
            System.out.print("Please enter your password: ");
            uPass = input.next();

            if (uName.equals(userName) && uPass.equals(passWord)) {
                System.out.println("You are logged in");
                break;
            } else {
                System.out.println("Try again!!\n");
            }
        }
    }

}
