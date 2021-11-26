package hw7.interaction;

import hw7.model.Animal;

import java.util.Random;

public class Work {
    private final Random random = new Random();
    private int workCount;

    public void doAction(Animal animal) {
        if (animal.getAge() < 5 || animal.getHappy() < 20) {
            System.out.println("Ошибка! Достигните age = 5 и happy = 20");
            return;
        }

        if (animal.getHungry() < 50) {
            animal.setUnHungry(true);
        } else {
            animal.setUnHungry(false);
        }
        if (animal.getHappy() < 20) {
            animal.setUnHappy(true);
        } else {
            animal.setUnHappy(false);
        }

        animal.addMoney(random.nextInt(20 -5) +5);

        if (animal.isUnHungry() && !animal.isIll()) {
            animal.addHungry(-4 * 1.5);
            animal.addHappy(-2 * 1.5);
        }
        if (animal.isIll() && !animal.isUnHungry()) {
            animal.addHungry(-4 * 2);
            animal.addHappy(-2 * 2);
        } else {
            animal.addHungry(-4);
            animal.addHappy(-2);
        }

        if (++workCount == 6) {
            workCount = 0;
            animal.addAge(1);
        }

        final int randomNumber = random.nextInt(100);
        if (randomNumber <= 10) {
            animal.setIll(true);
        }
    }
}