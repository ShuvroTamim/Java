package static_block;

public class Student {
    
    static int id;
    static String name;
    
    static{
        id = 101;
        name = "Tamim";
        System.out.println("Static block will execute before main method.");
    }   //Static block will execute before main method

    static void display(){
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        Student.display();
    }
}
