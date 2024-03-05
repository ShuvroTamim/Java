package super_as_method_reference;

public class Dog extends Animal{
    void eat(){
        System.out.println("Eating bread...");
    }
    void bark(){
        System.out.println("Barking...");
    }
    
    void work(){
        super.eat();
        bark();
    }
}
