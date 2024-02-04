package static_variable;

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class. 
public class CountWithoutStatic {
    int count = 0;  //will get memory each time when the instance is created 
    
    CountWithoutStatic(){
        count++;    //incrementing value  
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        
        //Creating objects  
        CountWithoutStatic c1 = new CountWithoutStatic();
        CountWithoutStatic c2 = new CountWithoutStatic();
        CountWithoutStatic c3 = new CountWithoutStatic();
    }
}
