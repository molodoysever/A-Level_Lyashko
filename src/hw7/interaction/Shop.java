package hw7.interaction;

import hw7.model.Animal;

import java.util.Random;
import java.util.Scanner;

public class Shop {

    public void doAction (Animal animal) {
        Scanner scanner = new Scanner(System.in);
        if (animal.getMoney() > 100) {
            int temp;
            do {
                System.out.println("Введите номер подарка\n" +
                        " 1. 100 монет (+20 happy) \n" +
                        " 2. 150 монет (+25 happy) \n" +
                        " 3. 200 монет (+30 happy) \n" );
                int s = scanner.nextInt();
                temp = s;
            Random random = new Random();
            String present = String.valueOf(random.nextInt(300));
            switch (s) {
                case 1: {
                    animal.setPresent(present);
                    animal.addMoney(-100);
                    animal.addHappy(20);
                    break;
                }
                case 2: {
                    animal.setPresent(present);
                    animal.addMoney(-150);
                    animal.addHappy(25);
                    break;
                }
                case 3: {
                    animal.setPresent(present);
                    animal.addMoney(-200);
                    animal.addHappy(30);
                    break;
                }
            }
            } while ( (temp != 1) && (temp != 2) && (temp != 3));
        } else {
            System.out.println("Мало денег");
        }
    }
}
