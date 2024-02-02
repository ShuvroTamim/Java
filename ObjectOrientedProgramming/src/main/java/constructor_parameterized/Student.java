package constructor_parameterized;

public class Student {
    int id;
    String name;
    
    Student(int i, String n){
        id = i;
        name = n;
    }
    
    void display(){
        System.out.println("\nId: " + id);
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(101 , "Tamim");
        Student s2 = new Student(102 , "Ahmed");
        
        s1.display();
        s2.display();
    }
}
