package StringProblem;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "Tamim Ahmed";
        System.out.println("Main String is: " + str);
        String rvrs = "";
        for (int i = 0; i < str.length(); i++) {
            rvrs = str.charAt(i) + rvrs;
        }
        System.out.println("\nReverse String is: " + rvrs);
    }
    
}
