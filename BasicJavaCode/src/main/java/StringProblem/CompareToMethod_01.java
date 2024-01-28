package StringProblem;

public class CompareToMethod_01 {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        String s5 = "flag";
        int rslt1 = s1.compareTo(s2);
        int rslt2 = s1.compareTo(s3);
        int rslt3 = s1.compareTo(s4);
        int rslt4 = s1.compareTo(s5);
        
        System.out.println("Result is: " + rslt1);  //0 because both are equal
        System.out.println("Result is: " + rslt2);  //-5 because "h" is 5 times lower than "m" 
        System.out.println("Result is: " + rslt3);  //-1 because "l" is 1 times lower than "m"
        System.out.println("Result is: " + rslt4);  //2 because "h" is 2 times greater than "f"
        
        /*
        compareTo() method compares the string on the basis
        of the "unicode value" of each character in the string.
        */
    }    
}
