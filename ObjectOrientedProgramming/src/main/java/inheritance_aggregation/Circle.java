package inheritance_aggregation;

public class Circle {
    Operation op;
    double pi = 3.14;
    double area(int radius){
        op = new Operation();
        return pi*op.square(radius);
    }
    
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println("The area is: " + result);
    }
}
