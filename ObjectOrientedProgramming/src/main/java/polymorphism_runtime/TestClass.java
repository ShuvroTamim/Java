package polymorphism_runtime;

public class TestClass {
    public static void main(String[] args) {
        Bank obj;
        
        obj = new SBI();    //Upcasting
        System.out.println("The SBI Rate of Interest is:" + obj.getRateOfInterest());
        
        obj = new ICICI();  //Upcasting
        System.out.println("The ICICI Rate of Interest is:" + obj.getRateOfInterest());
        
        obj = new AXIS();   //Upcasting
        System.out.println("The AXIS Rate of Interest is:" + obj.getRateOfInterest());
    }
}
