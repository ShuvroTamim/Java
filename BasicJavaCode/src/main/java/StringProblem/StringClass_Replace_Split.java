package StringProblem;

public class StringClass_Replace_Split {
    public static void main(String[] args) {
        String str1 = "My name is Tamim";
        System.out.println("String value is: " + str1);
        
        String str2 = str1.replace('m', 'n');
        System.out.println("Replaced String is: " + str2);
        
        String[] str3 = str1.split(" ");
        System.out.println("\nSplited String is: ");
        for (String splt : str3) {
            System.out.println(splt);
        }
    }
    
}
