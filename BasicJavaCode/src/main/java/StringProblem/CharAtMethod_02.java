package StringProblem;

public class CharAtMethod_02 {
    public static void main(String[] args) {
        String str = "Welcome";
        char ch = str.charAt(7);    //it throws StringIndexOutOfBoundsException at run time
        System.out.println("Output is: " + ch);
    }
    
}
