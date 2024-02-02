package constructor_default;

public class Student {
    int id;
    String name;
    
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        Student b1 = new Student();
        Student b2 = new Student();
        
        b1.display();
        b2.display();
    }
}
