package Assignments;

import java.util.Scanner;

public class Assignment18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] wkdys = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int len = wkdys.length;
        int day;
        System.out.print("Enter a day number: ");
        day = input.nextInt();

        
        if (day > len || day <= 0) {
            System.out.println("Please enter a correct day number.");
        }
        else {
            for (int i = 0; i < len; i++) {
                if (day == i + 1) {
                    System.out.println("The day is: " + wkdys[i]);
                    break;
                }
            }
        }
    }

}
