package hw7.interaction;

import hw7.model.Animal;

public class Recover {
    public void doAction (Animal animal) {
        if (animal.getMoney() < 50) {
            System.out.println("Недостаточно денег");
        } else {
            animal.setHappy(10);
            animal.setHungry(70);
            animal.setClear(80);
            animal.addMoney(-50);
            animal.setIll(false);
            animal.setUnHungry(false);
        }
    }
}
