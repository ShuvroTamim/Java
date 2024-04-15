package inheritance_multiple;

public class Test_Multiple_Intheritance implements Showable, Drawable{
    public void show(){
        System.out.println("Hello!");
    }
    public void draw(){
        System.out.println("Welcome.");
    }
    
    public static void main(String[] args) {
        Test_Multiple_Intheritance obj = new Test_Multiple_Intheritance();
        obj.show();
        obj.draw();
        System.out.println(Drawable.cube(5));
    }
}
