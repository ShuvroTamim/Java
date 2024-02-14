package inheritance_aggregation;

public class Employee {
    int id;
    String name;
    Address address;
    
    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    void display(){
        System.out.println("\nID:" + id + " and Name: " + name);
        System.out.println("Address: " + address.city + ", " + address.state + ", " + address.country);
    }
    
    public static void main(String[] args) {
        Address add1 = new Address("Tangail" , "Dhaka" , "Bangladesh");
        Address add2 = new Address("Kalihati" , "Khulna" , "Bangladesh");
        
        Employee e1 = new Employee(101 , "Tamim" , add1);
        Employee e2 = new Employee(102 , "Ahmed" , add2);
        
        e1.display();
        e2.display();
    }
}
