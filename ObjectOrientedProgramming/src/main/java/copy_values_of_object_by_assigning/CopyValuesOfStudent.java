package copy_values_of_object_by_assigning;

public class CopyValuesOfStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101 , "Tamim");
        Student s2 = new Student();
        
        s2.id = s1.id;
        s2.name = s1.name;
        
        s1.display();
        s2.display();
    }
}
