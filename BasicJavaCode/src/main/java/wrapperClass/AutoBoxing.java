package wrapperClass;

public class AutoBoxing {
    public static void main(String[] args) {
        //PRimitive -> Object
        int num1 = 35;
        Integer n1 = Integer.valueOf(num1);
        System.out.println("Value of object n1 is: " + n1);
        
        double num2 = 28.4;
        Double n2 = Double.valueOf(num2);
        System.out.println("Value of object n2 is: " + n2);
    }
    
}
