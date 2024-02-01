package employee_record;

public class Employee {
    int id;
    String name;
    double salary;
    
    void insert(int i, String nm, double s){
        id = i;
        name = nm;
        salary = s;
    }
    
    void display(){
        System.out.println("\nId: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
