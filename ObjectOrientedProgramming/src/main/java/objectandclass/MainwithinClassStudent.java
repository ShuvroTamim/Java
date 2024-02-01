package objectandclass;

//Java Program to illustrate how to define a class and fields  
//Defining a Student class.

class MainwithinClassStudent {
    //defining fields 
    int id;
    String name;    //field or data member or instance variable
    
    //creating main method inside the Student class  
    public static void main(String[] args) {        
        //Creating an object or instance
        MainwithinClassStudent obj = new MainwithinClassStudent();  //creating an object of Student 
        //Printing values of the object  
        System.out.println(obj.id);
        System.out.println(obj.name);
        
    }
}
