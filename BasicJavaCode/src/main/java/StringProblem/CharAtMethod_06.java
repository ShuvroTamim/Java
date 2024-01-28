package StringProblem;

public class CharAtMethod_06 {
    public static void main(String[] args) {
        String str = "Hello! tamim Ahmed";
        int count = 0;
        char ch;
        int len = str.length();
                
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' ||
                    ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' ||
                    ch == 'U' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels is: " + count);
    }
    
}
