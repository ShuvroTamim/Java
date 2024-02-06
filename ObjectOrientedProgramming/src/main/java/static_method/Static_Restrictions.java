package static_method;

public class Static_Restrictions {
    int n = 50; // instance or non-static variable
    
    public static void main(String[] args) {
        //System.out.println("Error vlue: " + n); //Compilation error    
        
        //We can call instance variable through object creation
        Static_Restrictions obj= new Static_Restrictions();
        int rslt = obj.n;
        System.out.println("Result is: " + rslt);        
    }
}
