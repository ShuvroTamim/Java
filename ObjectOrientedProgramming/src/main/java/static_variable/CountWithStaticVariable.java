package static_variable;

//Java Program to illustrate the use of static variable which  
//is shared with all objects. 
public class CountWithStaticVariable {
    static int count = 0;   //will get memory only once and retain its value 
    
    CountWithStaticVariable(){
        count++;    //incrementing the value of static variable
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        
        //creating objects  
        CountWithStaticVariable c1 = new CountWithStaticVariable();
        CountWithStaticVariable c2 = new CountWithStaticVariable();
        CountWithStaticVariable c3 = new CountWithStaticVariable();               
    }
}
