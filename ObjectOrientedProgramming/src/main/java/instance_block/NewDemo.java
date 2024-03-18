package instance_block;

public class NewDemo extends Demo{
    NewDemo(){
        super();
        System.out.println("Child class constructor involed");
    }
    
    NewDemo(int n){        
        super();
        System.out.println("");
        System.out.println("Child class constructor invoked " + n);
    }
    {
        System.out.println("Instance initaializer block is invoked");
    }
    
    public static void main(String[] args) {
        NewDemo nd1 = new NewDemo();
        NewDemo nd2 = new NewDemo(10);
    }
}
