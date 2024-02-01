package initializing_object_by_method;

public class LinkWithStudent {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        
        // Initalizing data by method
        std1.insertInfo(101, "Tamim");
        std2.insertInfo(102, "Ahmed");
        
        //Printing data by method
        std1.display();
        std2.display();
    }
}
