package copy_values_of_object_by_assigning;

public class Student {
    int id;
    String name;
    
    Student(int i, String n){
        id = i;
        name = n;
    }
    Student(){}
    
    void display(){
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
    }
}
