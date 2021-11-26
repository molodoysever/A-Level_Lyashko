package hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number;
        number = scanner.nextInt();
        if (number < 0) {
            System.out.println("ERROR! Enter positive number");
        } else {
            System.out.print("Binary = " + Integer.toBinaryString(number));
        }
    }
}
