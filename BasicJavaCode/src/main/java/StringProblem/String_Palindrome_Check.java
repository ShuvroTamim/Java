package StringProblem;

public class String_Palindrome_Check {
    public static void main(String[] args) {
        String str1 = "Madam", str2;
        //str2 = str1.reverse();        //str1 string class houay reverse hobe na
        //So use string buffer
        StringBuffer str = new StringBuffer(str1);
        
        str2 = str.reverse().toString(); // converted StringBuffer class to string class
        if (str2.equalsIgnoreCase(str1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
