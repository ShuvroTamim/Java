package JavaMethods;

public class InstanceMethodExample {
    public static void main(String[] args) {
        // Creating an object of the classs
        InstanceMethodExample obj = new InstanceMethodExample();
        int rslt = obj.add(12, 33);     //Invoking instance methods
        System.out.println("The sum is: " + rslt);
    }
    
    int sum;
    //User-defined method because we have not use static keyword
    public int add(int num1, int num2){
        sum = num1 +num2;
        return sum;
    }
}
