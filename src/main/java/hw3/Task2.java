package hw3;

public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1; x <= 999999; x++) {
            int num1 = x / 100000;
            int num2 = (x % 100000) / 10000;
            int num3 = (x % 10000) / 1000;
            int num4 = (x % 1000) / 100;
            int num5 = (x % 100) / 10;
            int num6 = x % 10;
            if(num1 + num2 + num3 == num4 + num5 + num6) {
                sum++;
            }
        }
        System.out.println("Lucky tickets = " + sum);
    }
}
