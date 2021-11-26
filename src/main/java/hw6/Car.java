package hw6;

public class Car {

    private final Manufacturer manufacturer;
    private final Engine engine;
    private final String colour;
    private final int petrol;

    public Engine getEngine() {
        return engine;
    }

    public Car(Manufacturer manufacturer, Engine engine, String colour) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.colour = colour;
        this.petrol = 100;
    }

    public void startEngine(String name) {
        System.out.println(name + " Start Engine");
    }

    public boolean isEnoughPetrolLevel() {
        return petrol > 50;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer.getRussianName() + '\'' +
                ", engine ='" + engine + '\'' +
                ", colour ='" + colour + '\'' +
                ", petrol = " + petrol +
                '}';

    }
}