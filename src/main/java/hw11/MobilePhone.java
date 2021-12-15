package hw11;

import java.util.Scanner;

public class MobilePhone extends Phone {
    Scanner scanner = new Scanner(System.in);

    public MobilePhone (Manufacturer manufacturer, Year year) {
        super(manufacturer, year);
    }

    @Override
    public String call() {
        System.out.println("1 - video call \n 2 - audio call");
        int i = scanner.nextInt();
        String a = "video" + number();
        String b = "audio" + number();
        return i == 1? a:b;
    }

    public String number() {
        System.out.println("enter number");
        String a = scanner.nextLine();
        return a;
    }

    public String charge() {
        System.out.println("no charge");
        return null;
    }

    public void photo() {
        System.out.println("smile =)");
    }
    @Override
    public void menu() {
        System.out.println(" 1 - call\n 2 - charge");
        int a = scanner.nextInt();
        switch (a) {
            case (1):
                call();
                break;
            case (2):
                charge();
                break;
            case (3):
                photo();
                break;
            default:
                System.out.println("wrong symbol");
        }
    }

    @Override
    public void app() {
        System.out.println("cool app is running");
    }
}
