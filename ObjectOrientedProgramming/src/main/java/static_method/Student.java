package static_method;

//Java Program to demonstrate the use of a static method.  
public class Student {
    int id;
    String name;
    static String college = "MGMC";
    
    //static method to change the value of static variable  
    static void change(){
        college = "PLAHST";
    }
    
    //constructor to initialize the variable  
    Student(int i , String n){
        id = i;
        name = n;
    }
    
    //method to display values  
    void display(){
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Colege: " + college);
    }
}
