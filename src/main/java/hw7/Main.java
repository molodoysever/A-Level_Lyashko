package hw7;

import hw7.model.Animal;
import hw7.service.UserInputService;

    public class Main {
        public static void main(String[] args) {
            UserInputService userInputService = new UserInputService();
            final Animal animal = userInputService.userInputAnimalTypeAndName();
            userInputService.doActions(animal);
        }
    }
