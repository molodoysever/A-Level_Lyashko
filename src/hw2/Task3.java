package hw2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("Generated number = " + a);
        if (a % 2 == 0 )
            System.out.println(a + " = is even");
        else
            System.out.println(a + " = is uneven");
    }
}
