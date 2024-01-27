package StringProblem;

public class CharAtMethod_04 {
    public static void main(String[] args) {
        String str = "Hello! Tamim Ahmed";
        int length = str.length();
        char ch;
        System.out.println("Odd characters list: \n");
        for (int i = 0; i < length; i++) {
            if (i%2 != 0) {
                ch = str.charAt(i);
                System.out.println("Character at " + i + " is: " + ch);
            }
        }
    }
    
}
