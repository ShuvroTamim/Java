package StringProblem;

public class ImmutableString_01 {
    public static void main(String[] args) {
        String s = "Tamim";
        s.concat("Ahmed");
        System.out.println(s);  //will print Tamim because strings are immutable objects
    }
    
}
