package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Declare_Create_Initialize {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("Size Of arrayList: " + num.size());

        num.add(123);
        num.add(1, 456);
        num.add(789);
        num.add(321);
        num.add(2, 369);
        num.add(5, 258);        
        System.out.println("The array is: " + num);

        //Using for-each loop
        System.out.print("\nArrayList using for-each loop: ");
        for (int nbr : num) {
            System.out.print(" " + nbr);
        }

        //Using Iterator class
        Iterator itr = num.iterator();
        System.out.print("\nArrayList using Iterator class:");
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }

        System.out.println("\n\nSize Of arrayList: " + num.size());

    }    
}
