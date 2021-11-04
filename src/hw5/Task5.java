package hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int input = 0;
        while (input <= 3) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input <= 3) {
                    System.out.println("Number must be more than 3. Try arain: ");
                }
            } else {
                System.out.println("Enter number. Try again: ");
                scanner.next();
            }
        }

        int [] numbers1 = new int[input];
        int even = 0;
        Random random = new Random();
        int upperBound = input;
        int lowerBound = 0;
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
            if (numbers1[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(Arrays.toString(numbers1));

        int [] numbers2 = new int[even];
        int i1 = 0;
        for (int i = 0; i < input; i++) {
            if (numbers1[i] % 2 == 0) {
                numbers2[i1] = numbers1[i];
                i1++;
            }
        }
        System.out.println(Arrays.toString(numbers2));
    }
}
