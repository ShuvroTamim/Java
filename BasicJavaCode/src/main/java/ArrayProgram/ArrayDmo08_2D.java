package ArrayProgram;

import java.util.Arrays;

public class ArrayDmo08_2D {
    public static void main(String[] args) {
        int[] arr = {10,18,-3,5,13};
        Arrays.sort(arr);
        
        System.out.print("Sorted ascending order array is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + arr[i]);
        }
        
        System.out.print("\nSorted descending order array is: ");
        for (int i = 4; i >=0; i--) {
            System.out.print(" " + arr[i]);
        }
        
        // For string sorting
        
        String[] names = {"Tamim","Mehedi","Jinia","Shofiq","Fatema"};
        Arrays.sort(names);
        
        System.out.print("\n\nSorted ascending names are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + names[i]);
        }
        
        System.out.print("\nSorted descending names are: ");
        for (int i = 4; i >=0; i--) {
            System.out.print(" " + names[i]);
        }
    }
    
}
