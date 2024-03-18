package polymorphism_upcasting;

public class Honda extends Bike {

    @Override
    void run() {
        System.out.println("Honda is running safely.");
    }

    public static void main(String[] args) {
        Bike obj = new Honda(); // Upcasting
        obj.run();
    }
}
