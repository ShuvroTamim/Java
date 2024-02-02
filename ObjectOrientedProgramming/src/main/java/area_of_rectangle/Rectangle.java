package area_of_rectangle;

public class Rectangle {
    float length;
    float width;
    
    void insertInfo(float l, float w){
        length = l;
        width = w;
    }
    
    void displayArea(){
        float area = length * width;
        System.out.println("\nLength of rectangle: " + length);
        System.out.println("Width of rectangle: " + width);
        System.out.println("The area of the rectangle: " + area);
    }
}
