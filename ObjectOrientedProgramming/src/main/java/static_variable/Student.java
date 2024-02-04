package static_variable;

public class Student {
    int id;
    String name;
    static String college = "ITS";
    
    Student(int i , String n){
        id = i;
        name = n;
    }
    
    void display(){
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}
