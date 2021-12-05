package hw6;

public class Main {
    public static void main(String[] args) {

        Engine type1 = new Engine(201, "sedan");
        Engine type2 = new Engine(199, "coupe");

        Car car1 = new Car(Manufacturer.BMW, type1, "white");
        Car car2 = new Car(Manufacturer.AUDI, type2, "black");

        System.out.println(car1);
        System.out.println(car2);

        car1.startEngine("user1");
        car2.startEngine("user2");

        Garage.checkСar(car1);
        Garage.checkСar(car2);

    }
}