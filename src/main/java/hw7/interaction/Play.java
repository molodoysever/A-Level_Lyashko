package hw7.interaction;
import hw7.model.Animal;
import java.util.Random;

public class Play {
    private int playCount;
    Random random = new Random();
    public void doAction(Animal animal) {

        if (animal.getHungry() > 50) {
            animal.setUnHungry(true);
        } else {
            animal.setUnHungry(false);
        }
        if (animal.getHappy() > 20) {
            animal.setUnHappy(false);
        } else {
            animal.setUnHappy(true);
        }
        animal.addHappy(6);
        animal.addMoney(random.nextInt(10) +1);
        if (++playCount ==5) {
            playCount = 0;
            animal.addAge(1);
        }

        if (animal.isUnHungry() && !animal.isUnHappy() && !animal.isIll()) {
            animal.addHungry(-3 * 1.5);
        }
        if (animal.isUnHappy() && !animal.isUnHungry() && !animal.isIll()) {
            animal.addHungry(-3 * 1.2);
        }
        if (animal.isIll() && !animal.isUnHappy() && !animal.isUnHungry()) {
            animal.addHungry(-3 * 2);
        }
        if (animal.isIll() && animal.isUnHappy() && animal.isUnHungry()) {
            animal.addHungry(-3 * 2 * 1.2 * 1.5);
        }
        if (animal.isIll() && !animal.isUnHappy() && animal.isUnHungry()) {
            animal.addHungry(-3 * 2 * 1.5);
        }
        if (animal.isIll() && animal.isUnHappy() && !animal.isUnHungry()) {
            animal.addHungry(-3 * 2 * 1.2);
        }
        if (!animal.isIll() && animal.isUnHappy() && animal.isUnHungry()) {
            animal.addHungry(-3 * 1 * 1.2);
        } else {
            animal.addHungry(-3);
        }
        int randomNum = random.nextInt(100);
        if (animal.getClear() < 50) {
            if (randomNum <= 30) {
                animal.setIll(true);
            }
        } else {
            if (randomNum <= 10) {
                animal.setIll(true);
            }
        }
    }
}