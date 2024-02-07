package static_method;

public class Static_Non_Static_Restriction {
    static int id = 101;    //Static vaiable can be accessed from anywhere
    
    void display1(){
        System.out.println("Id: " + id);
        System.out.println("This is a non-static method");
    }
    
    static void display2(){
        System.out.println("\nId: " + id);  //Non-Static vaiable can not be accessed from a static method
        System.out.println("This is a static method");
    }
    
    //We declare main() as static so that we don't have to create object to access it
    public static void main(String[] args) {
        
        //To access instance method we have to create object of the class
        Static_Non_Static_Restriction obj = new Static_Non_Static_Restriction();
        obj.display1();
        
        //to access static method we don't have to create object of the class
        Static_Non_Static_Restriction.display2();
    }
}
