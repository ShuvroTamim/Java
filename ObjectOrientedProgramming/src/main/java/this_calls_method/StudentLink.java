package this_calls_method;

public class StudentLink {
    public static void main(String[] args) {
        Student s1 = new Student(101 , "Tamim" , "Java");
        Student s2 = new Student(101 , "Tamim" , "Java" , 6000);
        
        s1.display();
        s2.display();
    }
}
