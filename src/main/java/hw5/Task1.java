package hw5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = new int [12];
        Random random = new Random();
        int upperBound = 15;
        int lowerBound = -15;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
        }
        System.out.println(Arrays.toString(numbers));

        int maxValue = numbers [0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                index = i;
            }
        }
        System.out.println("Index:" + index + " max value:" + maxValue);
    }
}
