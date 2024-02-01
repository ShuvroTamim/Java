package initializing_object_by_method;

class Student {
    int id;
    String name;
    
    void insertInfo(int i, String nm){
        id = i;
        name = nm;
    }
    
    void display(){
        System.out.println("\nId: " + id);
        System.out.println("Name: " + name);
    }
}
