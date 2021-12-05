package hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] numbers = new int[4];
        Random random = new Random();
        int upperBound = 99;
        int lowerBound = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
        }
        System.out.println(Arrays.toString(numbers));

        boolean mark = true;
        for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] <= numbers[i-1]) {
                mark = false;
                break;
            }
        }
        if (mark) {
            System.out.println("Array is increasing");
        } else {
            System.out.println("Array is not increasing");
        }
    }
}
