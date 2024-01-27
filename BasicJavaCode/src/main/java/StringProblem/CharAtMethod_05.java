package StringProblem;

public class CharAtMethod_05 {
    public static void main(String[] args) {
        String str = "Hello Tamim Ahmed";
        char ch;
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'm') {
                count++;
            }
        }
        System.out.println("Number of character 'm' is: " + count);
        
    }
    
}
