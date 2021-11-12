package hw7.service;

import hw7.interaction.Food;
import hw7.model.Animal;
import hw7.model.AnimalType;

import java.util.Scanner;

public class UserInputService {
    private final Scanner SCANNER = new Scanner(System.in);
    private final Food food = new Food();

    public Animal userInputAnimalType () {
        System.out.println("Доступные типы персонажа");
        final AnimalType[] values = AnimalType.values();
        StringBuilder AnimalTypeString = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            AnimalTypeString.append(i).append(") ")
                    .append(values[i]).append("\n");
        }
        System.out.println(AnimalTypeString);
        int userInputAnimalType = -1;
        System.out.println("Введите номер животного: ");
        do {
            userInputAnimalType = SCANNER.nextInt();
        }
        while (userInputAnimalType < 0 || userInputAnimalType >= values.length);

        String userInputAnimalName;
        do {
            System.out.println("Введите имя животного от 3 до 20 символов");
            userInputAnimalName = SCANNER.next();
        } while (userInputAnimalName.length() < 3 || userInputAnimalName.length() > 28);

        return new Animal(userInputAnimalName, values[userInputAnimalType]);
    }

    public void doActions(Animal animal) {
        StringBuilder builder = new StringBuilder("Выбирете действие: \n");
        builder.append(0).append(") Выйти \n");
        builder.append(1).append(") Кормить \n");

        int userAction;
        do {
            System.out.println(animal);
            System.out.println(builder);
            userAction = SCANNER.nextInt();

            switch (userAction) {
                case 0: {
                    System.exit(0);
                }
                case 1: {
                    food.doAction(animal);
                    break;
                }

                default: {
                    throw new IllegalStateException();
                }
            }
        }
        while (userAction != 0);
    }
}
