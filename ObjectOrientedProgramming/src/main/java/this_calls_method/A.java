package this_calls_method;

public class A {
    void m(){
        System.out.println("Hello m");
    }
    
    void n(){
        System.out.println("Hello n");
        
        //m();//same as this.m() 
        this.m();
    }
}
