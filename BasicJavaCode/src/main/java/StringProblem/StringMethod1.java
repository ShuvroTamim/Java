package StringProblem;

public class StringMethod1 {

    public static void main(String[] args) {
        String str1 = "Tamim Ahmed";
        String str2 = new String("Tamim ahmed");
        
        String fName = "Tamim";
        String lName = "Ahmed";  
        String fullName1, fullName2, toUp, toLow;
        
        System.out.println(str1);
        System.out.println(str2);
        
        //equals method
        if (str1.equals(str2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
        
        //equalsIgnoreCase Method
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Case Ignored");
        } else {
            System.out.println("Case Not Ignored");
        }
        
        //Contains method
        if (str1.contains(str2)) {
            System.out.println("Contains");
        } else {
            System.out.println("Doesn't Contains");
        }
        if (str1.contains("Ahmed")) {
            System.out.println("Contains Name");
        } else {
            System.out.println("Doesn't Contains Name");
        }
        
        //isEmpty Method #Prints boolean value
        if (str2.isEmpty()) {
            System.out.println("Printing empty");
        } else {
            System.out.println("Printing not empty");
        }
        
        //concat method
        fullName1 = fName.concat(lName);
        fullName2 = fName + lName;
        
        System.out.println("Full name is: " + fullName1);
        System.out.println("Full name is: " + fullName2);
        

        //toUpperCase & toLowerCase method
        toUp = fullName1.toUpperCase();
        toLow = fullName2.toLowerCase();
        
        System.out.println("Full name in Upper Case: " + toUp);
        System.out.println("Full name in Lower Case: " + toLow);
                        
    }
}
