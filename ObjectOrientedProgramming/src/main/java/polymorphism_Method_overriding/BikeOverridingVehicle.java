package polymorphism_Method_overriding;

//Creating a child class 
public class BikeOverridingVehicle extends Vehicle{
    //defining the same method as in the parent class
    @Override
    void run(){         
        System.out.println("Vehicle is running safely");
    }
    public static void main(String[] args) {
        
        //creating an instance of child class
        BikeOverridingVehicle obj = new BikeOverridingVehicle();
        //calling the method with child class instance
        obj.run();
    }
}
