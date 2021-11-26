package hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Width");
        int width = 0;
        do { width = scanner.nextInt();
        } while ( width < 0);
        System.out.println("Heigh");
        int heigh = 0;
        do { heigh = scanner.nextInt();
        } while ( heigh < 0);
        int area = (width * heigh)/2;
        System.out.println("Area = " + area);
    }
}
