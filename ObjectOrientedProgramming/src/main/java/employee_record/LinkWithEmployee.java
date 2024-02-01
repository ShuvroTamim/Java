package employee_record;

public class LinkWithEmployee {
    public static void main(String[] args) {
        Employee em1 = new Employee();
        Employee em2 = new Employee();
        Employee em3 = new Employee();
        
        em1.insert(101, "Tamim", 24660);
        em2.insert(102, "Ahmed", 22360.50);
        em3.insert(103, "Shapon", 32360.65);
        
        em1.display();
        em2.display();
        em3.display();
    }
}
