package StringProblem;

public class CompareToMethod_02 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "";
        String str3 = "flag";
        
        int val1 = str1.compareTo(str2);
        int val2 = str2.compareTo(str3);
        
        System.out.println("The result is: " + val1);
        System.out.println("The result is: " + val2);
    }
    
}
