package StringProblem;

public class StringComparison_2 {

    public static void main(String args[]) {
        
        /*The String class compareTo() method compares values lexicographically 
        and returns an integer value that describes if first string is less than, 
        equal to or greater than second string.*/
        
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";

        System.out.println(s1.compareTo(s2));//0(because s1==s2)
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
    }
}
