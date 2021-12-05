package hw7.interaction;

import hw7.model.Animal;

public class Food {
    public void doAction(Animal animal) {
        if (animal.getHungry() > 50) {
            animal.setUnHungry(true);
        } else {
            animal.setUnHungry(false);
        }
        if (animal.getHappy() < 20) {
            animal.setUnHappy(true);
        } else {
            animal.setUnHappy(false);
        }


        animal.addHungry(5);

        if (animal.isUnHungry() && !animal.isUnHappy() && !animal.isIll()) {
            animal.addClear(-2 * 1.5);
        }
        if (animal.isUnHappy() && !animal.isUnHungry() && !animal.isIll()) {
            animal.addClear(-2 * 1.2);
        }
        if (animal.isIll() && !animal.isUnHappy() && !animal.isUnHungry()) {
            animal.addClear(-2 * 2);
        }
        if (animal.isIll() && animal.isUnHappy() && !animal.isUnHungry()) {
            animal.addClear(-2 * 2 * 1.2);
        }
        if (animal.isIll() && !animal.isUnHappy() && animal.isUnHungry()) {
            animal.addClear(-2 * 2 * 1.5);
        }
        if (!animal.isIll() && animal.isUnHappy() && animal.isUnHungry()) {
            animal.addClear(-2 * 1.2 * 1.5);
        } else {
            animal.addClear(-2);
        }
    }
}