package StringProblem;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Tamim");
        System.out.println("The string is: " + str);
        str.append("Ahmed");
        str.append(28);
        str.append(23.5);
        System.out.println("New String is: " + str);
    }
    
}
