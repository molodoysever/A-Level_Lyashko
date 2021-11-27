package hw3.task5;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);
    private char symbol;
    int num1;
    int num2;

    public char getSymbol() {
        symbol = scanner.next().charAt(0);
        return symbol;
    }

    public int getNum1() {
        num1 = scanner.nextInt();
        return num1;
    }

    public int getNum2() {
        num2 = scanner.nextInt();
        return num2;
    }
}
