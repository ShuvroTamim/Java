package inheritance_code;

public class EmployeeProgrammer extends Employee {
    int bonus = 10000;
    
    public static void main(String[] args) {
        EmployeeProgrammer p = new EmployeeProgrammer();
        int sal , bon;
        
        sal = p.salary;
        bon = p.bonus;
        
        System.out.println("Salary: " + sal);
        System.out.println("Bonus: " + bon);
    }
    
}
