package super_as_reference_variable;

public class Animal_Dog extends Animal{
    String color = "Black";
    
    void display(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
