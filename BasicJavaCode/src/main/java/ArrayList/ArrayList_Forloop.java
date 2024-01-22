package ArrayList;

import java.util.ArrayList;

public class ArrayList_Forloop {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("ArrayList Size is: " + num.size());
        
        num.add(123);
        num.add(456);
        num.add(789);
        num.add(321);
        num.add(369);
        num.add(258);
        
        System.out.print("Element of ArrayList: ");
        for (int i = 0; i < num.size(); i++) {
            System.out.print(" " + num.get(i));
        }
        
        System.out.println("\nThe size of ArrayList: " + num.size());
    }
    
}
