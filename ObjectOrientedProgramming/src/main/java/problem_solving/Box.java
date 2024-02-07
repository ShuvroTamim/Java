package problem_solving;

public class Box {
    
    double height;
    double width;
    double depth;
    
    Box(double h , double w , double d){
        height = h;
        width = w;
        depth = d;
    }
    
    void displayVol(){
        double vol = height * width * depth;
        System.out.println("\nThe volume of the box is: " + vol);
    }        
    
}
