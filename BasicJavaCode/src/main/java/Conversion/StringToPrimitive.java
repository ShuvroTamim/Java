package Conversion;

public class StringToPrimitive {
    public static void main(String[] args) {
        String s1 = "28";
        int n1 = Integer.parseInt(s1);
        System.out.println("String to Integer value: " + n1);
        
        double d = Double.parseDouble(s1);
        System.out.println("String to Double value: " + d);
        
        int n2 = Integer.valueOf(s1);
        System.out.println("String to Integer value: " + n2);
    }
    
}
