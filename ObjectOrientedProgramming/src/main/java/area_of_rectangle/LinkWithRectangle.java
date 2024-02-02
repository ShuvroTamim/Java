package area_of_rectangle;

public class LinkWithRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        
        r1.insertInfo(22, 19);
        r2.insertInfo(29,16);
        
        r1.displayArea();
        r2.displayArea();
    }
    
}
