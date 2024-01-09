package StringProblem;

public class StringComparison_1 {

    public static void main(String args[]) {
        //This code, demonstrates the use of == operator used for comparing two String objects.s
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");

        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3);//false(because s3 refers to instance created in nonpool)
    }

}
