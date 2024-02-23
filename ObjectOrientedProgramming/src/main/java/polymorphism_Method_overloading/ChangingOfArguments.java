package polymorphism_Method_overloading;

public class ChangingOfArguments {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){    //Method Overloading
        return a+b+c;
    }
    
    public static void main(String[] args) {
        int sum1 = ChangingOfArguments.add(12, 13);
        int sum2 = ChangingOfArguments.add(12, 13 , 25);
        
        System.out.println("Sum of First method parameter: " + sum1);
        System.out.println("Sum of Second method parameter: " + sum2);
    }
}
