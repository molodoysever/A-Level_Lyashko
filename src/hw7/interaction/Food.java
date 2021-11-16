package hw7.interaction;

import hw7.model.Animal;

import java.util.Scanner;

public class Food {
    public void doAction(Animal animal) {
        int hungry = animal.getHungry();
        hungry += 5;
        animal.setHungry(hungry);

        int cleen = animal.getClean();
        cleen -= 2;
        animal.setClean(cleen);
    }
}
