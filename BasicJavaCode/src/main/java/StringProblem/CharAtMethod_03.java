package StringProblem;

public class CharAtMethod_03 {
    public static void main(String[] args) {
        String str = "Welcome Tamim Ahmed";
        char fCh = str.charAt(0);
        System.out.println("First character is: " + fCh);
        
        int length = str.length();
        char lCh = str.charAt(length - 1);
        System.out.println("Last char is: " + lCh);
    }
    
}
