package hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
            double x, y, z;
            char operation;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operator (+, -, /, *): ");
            operation = scanner.next().charAt(0);
            System.out.println("Enter first number: ");
            x = scanner.nextDouble();
            if (())
            y = scanner.nextDouble();
            switch (operation) {
                case '+' : z = x + y;
                break;
                case '-' : z = x - y;
                break;
                case '/' : z = x / y;
                break;
                case '*' : z = x * y;
                break;
                default:
                    System.out.println("Error! Enter correct operator");
                    return;
            }
            System.out.println(x + " " + operation + " " + y + " = " + z);
    }
}
