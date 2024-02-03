package copy_values_of_object_by_constructor;

//Java program to initialize the values from one object to another object.
public class Student {
    int id;
    String name;
    
    //constructor to initialize integer and string  
    Student(int i, String n){
        id = i;
        name = n;
    }
    
     //constructor to initialize another object 
    Student(Student s){
        id = s.id;
        name = s.name;
    }
    
    void display(){
        System.out.println("\nId: " + id);
        System.out.println("Name: " + name);
    }
}
