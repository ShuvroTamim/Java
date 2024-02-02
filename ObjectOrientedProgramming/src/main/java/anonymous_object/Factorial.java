package anonymous_object;

public class Factorial {
    void fact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        
        System.out.println("The factorial of " + n + " is: " + fact);
    }
}
