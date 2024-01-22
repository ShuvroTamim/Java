package StringProblem;

public class StringBufferClass {
    public static void main(String[] args) {
        String str1 = new String("Tamim Ahmed");
        StringBuffer sb = new StringBuffer("Tamim");
        
        str1.replace('m', 'n');
        System.out.println("Replaced String is: " + str1);
        System.out.println("Original value of String class has not changed.\n");
        
        String str2 = str1.replace('m', 'n');
        System.out.println("Replaced String is: " + str2);
        System.out.println("Original value of String class has changed for new object.\n");
        
        sb.append('_');
        sb.append("Ahmed ");
        sb.append(28);
        System.out.println("New String Buffer: " + sb);
        System.out.println("Original value of String Buffer class has changed.\n");
    }
    
}
