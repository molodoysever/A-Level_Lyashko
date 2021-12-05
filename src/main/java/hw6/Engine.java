package hw6;

public class Engine {

    private final int power;
    private final String type;

    public Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power + "hp" +
                ", type='" + type + '\'' +
                '}';
    }
}