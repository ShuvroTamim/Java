package polymorphism_Method_overloading;

public class ChangingDataTypes {
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b, double c){    //Method Overloading
        return a+b+c;
    }
    
    public static void main(String[] args) {
        int sum1 = ChangingDataTypes.add(12, 13);
        double sum2 = ChangingDataTypes.add(12.23, 13.02 , 25.25);
        
        System.out.println("Sum of First method parameter: " + sum1);
        System.out.println("Sum of Second method parameter: " + sum2);
    }
}
