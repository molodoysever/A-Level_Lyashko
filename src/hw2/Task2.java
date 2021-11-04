package hw2;

import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("Mean 1 = " +a);
        int b = random.nextInt();
        System.out.println("Mean 2 = " +b);
        int c = random.nextInt();
        System.out.println("Mean 3 = " +c);
        if (a < b && a < c) {
            System.out.println("Smallest = " + a);
        } else if (b < c && b < a) {
            System.out.println("Smallest = " + b);
        } else {
            System.out.println("Smallest = " + c);
        }
    }
}
