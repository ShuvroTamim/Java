package Assignments;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int phonePrice, numberOfInstallment;
        float installmentPerMonth;
        
        System.out.print("Enter the price of the phone: ");
        phonePrice = input.nextInt();
        
        System.out.print("Enter the number of installment: ");
        numberOfInstallment = input.nextInt();
        
        installmentPerMonth = phonePrice/numberOfInstallment;
        
        System.out.println("Amount of installment per month: " + installmentPerMonth);
    }
    
}
