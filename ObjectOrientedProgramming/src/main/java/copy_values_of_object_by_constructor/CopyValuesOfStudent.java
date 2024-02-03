package copy_values_of_object_by_constructor;

public class CopyValuesOfStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101 , "Tamim");
        Student s2 = new Student(s1);
        
        s1.display();
        s2.display();
    }
}
