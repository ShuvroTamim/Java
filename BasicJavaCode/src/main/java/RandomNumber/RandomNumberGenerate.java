package RandomNumber;

import java.util.Random;

public class RandomNumberGenerate {
    public static void main(String[] args) {
        Random rnd = new Random();
        int store = rnd.nextInt(3) + 5;
        System.out.println("Random Number is: " + store);
    }
    
}
