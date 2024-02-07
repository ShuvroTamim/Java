package static_method;

public class Static_Non_Static {
        
    void display1(){
        System.out.println("This is a Non-Static method");
    }
    static void display2(){
        System.out.println("This is a Static method");
    }
    
    //We declare main() as static so that we don't have to create object to access it
    public static void main(String[] args) {
        
        //To access instance method we have to create object of the class
        Static_Non_Static obj = new Static_Non_Static();
        obj.display1();
        
        //to access static method we don't have to create object of the class
        Static_Non_Static.display2();
    }
    
}
