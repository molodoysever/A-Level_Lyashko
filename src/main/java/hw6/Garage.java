package hw6;

public class Garage {
        public static void checkСar (Car car){
            if (car.isEnoughPetrolLevel()) {
                System.out.println("Бензин есть! Можно ехать");
            } else {
                System.out.println("Бензина нет! Заправься");
            }
            if (car.getEngine().getPower() > 200) {
                System.out.println("Мощность есть, можем ехать" );
            } else {
                System.out.println("Мощности недостаточно");
            }
        }
}
