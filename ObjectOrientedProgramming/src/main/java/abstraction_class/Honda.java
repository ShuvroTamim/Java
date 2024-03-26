package abstraction_class;

public class Honda extends Bike{
    @Override
    void run(){
        System.out.println("Running Safely.");
    }
    public static void main(String[] args) {
        Bike obj = new Honda(); //Upcasting
        obj.run();
    }
}
