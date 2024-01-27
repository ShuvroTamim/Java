package Conversion;

public class PrimitiveToString {
    public static void main(String[] args) {
        int n = 28;
        String s1 = Integer.toString(n);
        System.out.println("Integer to String value: " + s1);
        double d = 28.4;
        String s2 = Double.toString(d);
        System.out.println("Double to String value: " + s2);
        boolean b = true;
        String s3 = Boolean.toString(b);
        System.out.println("Boolean to string value: " + s3);
    }
    
}
