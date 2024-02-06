package static_method;

//Test class to create and display the values of object  
public class LinkWithStudent {
    public static void main(String[] args) {
        
        Student.change();   //calling change method 
        
        //creating objects  
        Student s1 = new Student(101 , "Tamim");
        Student s2 = new Student(1021 , "Ahmed");
        Student s3 = new Student(103 , "Shapon");
        
        //calling display method 
        s1.display();
        s2.display();
        s3.display();
        
    }
}
