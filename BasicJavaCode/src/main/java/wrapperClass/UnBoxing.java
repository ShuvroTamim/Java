package wrapperClass;

public class UnBoxing {
    public static void main(String[] args) {
        //Object -> Primitive
        Integer num1 = new Integer(28);
        int n1 = num1.intValue();
        System.out.println("Primitive value of n1 is: " + n1);
        
        Double num2 = new Double(28.4);
        double n2 = num2.doubleValue();
        System.out.println("Primitive value of n2 id: " + n2);
    }
    
}
