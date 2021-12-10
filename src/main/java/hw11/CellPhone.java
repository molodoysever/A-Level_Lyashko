package hw11;

import java.util.Scanner;

public class CellPhone extends Phone {
    protected Scanner scanner = new Scanner(System.in);

    public CellPhone (Manufacturer manufacturer, Year year) {
        super(manufacturer, year);
    }

    @Override
    public String call(){
        System.out.println("Наберите номер");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        return i;
    }

    @Override
    public String charge() {
        return null;
    }

    @Override
    public void menu() {
        System.out.println("1- call\n 2 - charge");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                call();
            break;
            case 2:
                System.out.println(charge());
                break;
            default:
                System.out.println("incorrect number");
        }
    }

    public void flashlight() {
        System.out.println("flashlight is on");
        }

    @Override
    public void app() {
        System.out.println("run app");
    }
}
