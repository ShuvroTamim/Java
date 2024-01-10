package ArrayProgram;

public class ArrayForEachLoop_1 {
    public static void main(String[] args) {
        String[] names = {"Tamim", "Mehedi", "Jinia", "Halima", "Nibir", "Abir"};
        int len = names.length;
        System.out.println("The length of the string is: " + len);
        System.out.println("\nPrinting names array using normal for loop.");
        System.out.print("Names are: ");
        for (int i = 0; i < len; i++) {
            System.out.print(names[i] + " ");
        }
        
        System.out.println("\n\nPrinting names array using for each loop.");
        System.out.print("Names are: ");
        for (String str : names) {
            System.out.print(str + " ");
        }
    }
    
}
