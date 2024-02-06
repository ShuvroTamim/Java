package static_method;

//Java Program to get the cube of a given number using the static method  
public class Calculation {
    static int cube(int n){
        return n*n*n;
    }
    
    public static void main(String[] args) {
        int result = Calculation.cube(5);
        System.out.println("Result is: " + result);
    }
}
