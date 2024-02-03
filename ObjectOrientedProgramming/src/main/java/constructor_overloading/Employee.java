package constructor_overloading;

//Java program to overload constructors  
public class Employee {
    int id;
    String name;
    double salary;
    
    //creating two arg constructor 
    Employee(int i, String n){
        id = i;
        name = n;        
    }
    
    //creating three arg constructor 
    Employee(int i , String n , double s){
        id = i;
        name = n;
        salary = s;
    }
    
    void display(){
        System.out.println("\nID:" + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {        
        Employee e1 = new Employee(101 , "Tamim");
        Employee e2 = new Employee(102 , "Ahmed" , 24600);
        
        e1.display();
        e2.display();
    }
}
