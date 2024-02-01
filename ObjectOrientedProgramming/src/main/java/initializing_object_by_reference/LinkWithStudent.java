package initializing_object_by_reference;

public class LinkWithStudent {
    public static void main(String[] args) {
        Student std1, std2;   //Declaring Object
        std1 = new Student();   // creating Object
        std2 = new Student();   // creating Object
        
        // Storing data to the object1
        std1.id = 101;
        std1.name = "Tamim";
        
        /*We can also create multiple objects and 
        store information in it through reference variable.*/
        
        // Storing data to the object1
        std2.id = 102;
        std2.name = "Ahmed";
        
        System.out.println("Id: " + std1.id);
        System.out.println("Name: " + std1.name);
        
        System.out.println("\nId: " + std2.id);
        System.out.println("Name: " + std2.name);
    }
}
