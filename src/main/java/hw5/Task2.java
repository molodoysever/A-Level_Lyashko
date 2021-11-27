package hw5;

import java.util.Random;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] numbers = new int[8];
        Random random = new Random();
        int upperBound = 10;
        int lowerBound = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                numbers [i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
