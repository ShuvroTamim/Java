package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("ArrayList Size is: " + num.size());
        
        num.add(123);
        num.add(456);
        num.add(789);
        num.add(321);
        num.add(369);
        num.add(258);
        
        System.out.println("Before Sorting: " + num);
        
        Collections.sort(num);
        System.out.println("\nSorting in ascending order: " + num);
        
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("\nSorting in reverse order: " + num);
    }
    
}
