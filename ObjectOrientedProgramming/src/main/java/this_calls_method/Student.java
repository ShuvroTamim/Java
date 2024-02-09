package this_calls_method;

public class Student {
    int id;
    String name, course;
    float fee;
    
    Student(int id , String name , String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
    Student(int id , String name , String course , float fee){
        this(id , name , course);
        this.fee = fee;
    }
    
    void display(){
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
    }
}
