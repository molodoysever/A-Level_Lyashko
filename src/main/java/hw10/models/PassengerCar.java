package hw10.models;
import hw10.Recoverable;
import java.util.Arrays;

public class PassengerCar extends Car implements Recoverable {
    Passenger[] passengers = new Passenger[3];
    private final String Type = "passenger";
    private int quantityPassenger = 0;

    public PassengerCar(String series, int year, String color) {
        super(series, year, color);
    }

    public void setFuel(int fuel) {
        super.fuel = fuel;
    }

    public String getType() {
        return Type;
    }

    public void addPassenger(Passenger passenger) {
        if (quantityPassenger < passengers.length) {
            for (int i = 0; i < passengers.length; i++) {
                if (passengers[i] == null) {
                    passengers[i] = passenger;
                    ++quantityPassenger;
                    System.out.println("Пассажир сел");
                    break;
                }
            }
        }
        else {
            System.out.println("Мест нет");
        }
    }

    public void removePassenger() {
        if (quantityPassenger > 0) {
            for (int i = 0; i < passengers.length; i++) {
                if (passengers[i] != null) {
                    passengers[i] = null;
                    --quantityPassenger;
                    System.out.println("Пассажир вышел");
                    break;
                }
            }
        }
        else {
            System.out.println("Пассажиров нет");
        }
    }

    @Override
    public void showStatistic() {
        System.out.printf("Series: %s\n" +
                        "Year: %d\n" +
                        "Color: %s\n" +
                        "Fuel: %d \n" +
                        "Кол-во поездок: %d \n" +
                        "Пассажиров: %d ",
                series, year, color, fuel, moveCount, quantityPassenger);
        System.out.println(Arrays.toString(passengers));
    }

    @Override
    public void refuel() {
        setFuel(100);
        System.out.println("Заправились");
    }
}
