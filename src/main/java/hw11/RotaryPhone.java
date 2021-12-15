package hw11;

import java.util.Scanner;

public class RotaryPhone extends Phone {

    public RotaryPhone (Manufacturer manufacturer, Year year) {
        super(manufacturer, year);
    }

    @Override
    public String call() {
        System.out.println("enter number");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;
    }

    @Override
    public String charge() {
        return "no charge";
    }

    public void ring() {
        System.out.println("ringing");
    }

    @Override
    public void menu() {
        System.out.println("number 1-9");
    }

    @Override
    public void app() {
    }
}
