package StringProblem;

public class SubStringMethod {

    public static void main(String args[]) {
        
        String s = "SachinTendulkar";
        System.out.println("Original String: " + s);
        /*
        public String substring(int startIndex):
        This method returns new String object containing the substring 
        of the given string from specified startIndex (inclusive). The 
        method throws an IndexOutOfBoundException when the startIndex 
        is larger than the length of String or less than zero.
        */
        System.out.println("Substring starting from index 6: " + s.substring(6));//Tendulkar    
        
        /*
        public String substring(int startIndex, int endIndex):
        This method returns new String object containing the substring 
        of the given string from specified startIndex to endIndex. The 
        method throws an IndexOutOfBoundException when the startIndex is 
        less than zero or startIndex is greater than endIndex or endIndex 
        is greater than length of String.
        */
        System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); //Sachin  
    }
}
