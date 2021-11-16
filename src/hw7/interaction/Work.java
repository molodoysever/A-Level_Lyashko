package hw7.interaction;

import hw7.model.Animal;

import java.util.Random;

public class Work {
   private final Random random = new Random ();

        public void doAction(Animal animal) {
            if (animal.getAge() < 5) {
                System.out.println("Error!");
                return;
            }
        }
}
