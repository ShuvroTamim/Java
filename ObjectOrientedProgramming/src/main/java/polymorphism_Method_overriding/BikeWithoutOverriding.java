package polymorphism_Method_overriding;

public class BikeWithoutOverriding extends Vehicle{ // Child class extends parent class
    public static void main(String[] args) {
        BikeWithoutOverriding obj = new BikeWithoutOverriding();
        obj.run();
    }
}
