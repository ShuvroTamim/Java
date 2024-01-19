package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Access_Set_Remove_Item {
    public static void main(String[] args) {
        int n, value;
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("ArrayList Size is: " + num.size());
        
        num.add(123);
        num.add(456);
        num.add(789);
        num.add(321);
        num.add(369);
        num.add(258);
        
        System.out.println("ArrayList: " + num);
        
        Iterator itr = num.iterator();
        System.out.print("\nArrayList is: ");
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
        
        System.out.println("\nArrayList Size is: " + num.size());
        
        // Getting individual data
        System.out.print("\nEnter an index number: ");
        n = input.nextInt();
        value = num.get(n);
        System.out.printf("Value at position %d is: %d", n+1, value);
        
        // Modifying a data
        num.set(3, 159);
        System.out.println("\n\nModified ArrayList: " + num);
        System.out.println("ArrayList Size is: " + num.size());
        
        // Removing a data
        num.remove(n);
        System.out.println("\nArrayList after removing: " + num);
        System.out.println("ArrayList Size is: " + num.size());
        
        //Clearing list
        num.clear();
        System.out.println("\nArrayList after clearing: " + num);
        System.out.println("ArrayList Size is: " + num.size());
        
        
    }
    
}
