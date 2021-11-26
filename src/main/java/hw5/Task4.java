package hw5;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] numbers1 = new int[5];
        int [] numbers2 = new int[5];
        Random random = new Random();
        int upperBound = 5;
        int lowerBound = 0;
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
        }
        for (int i =0; i < numbers2.length; i++) {
            numbers2[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
        }
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        double average1 = 0;
        double average2 = 0;
        for (int i = 0; i < 5; i++) {
            average1 += numbers1[i];
            average2 += numbers2[i];
        }
        average1 /=5;
        average2 /=5;
        if (average1 > average2) {
            System.out.println("Average numbers1 = ("+average1+") more then average numbers2 = ("+average2+")");
        } else if (average1 < average2) {
            System.out.println("Average numbers2 = ("+average2+") more then average numbers1 = ("+average1+")");
        } else {
            System.out.println("Average numbers1/2 are simmilar = ("+average1+")");
        }
    }
}
