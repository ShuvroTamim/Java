package anonymous_object;

import java.util.Scanner;

public class LinkWithFactorial {
    public static void main(String[] args) {
        int f;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter factorial value: ");
        f = input.nextInt();
        
        new Factorial().fact(f);    //calling method with anonymous object  
    }
}
