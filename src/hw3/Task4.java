package hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int secret, guess = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number 0 to 10");
        secret = (int)Math.floor(Math.random() * 10);
        do {
            System.out.println("Enter a number");
            guess = scanner.nextInt();
            if (secret > guess)
                System.out.println("Мало");
            else if (secret < guess)
                System.out.println("Много");
            else System.out.println("Угадал");
        } while (guess != secret);
    }
}
