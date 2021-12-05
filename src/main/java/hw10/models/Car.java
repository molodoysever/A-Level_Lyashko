package hw10.models;

public abstract class Car {
    final String series;
    final int year;
    final int fuelConsumption = 12;
    String color;
    int fuel;
    int moveCount = 0;
    boolean isNotEmptyGas = true;

    public Car(String series, int year, String color) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuel = 100;
    }

    public void addFuel(int fuel) {
        this.fuel += fuel;
        isNotEmptyGas = this.fuel >= fuelConsumption;
    }

    public void move() {
        if (isNotEmptyGas) {
            addFuel( - fuelConsumption);
            ++moveCount;
            System.out.println("Поехали!");
        }
        else {
            System.out.println("Заправьте авто");
        }
    }

    public abstract void showStatistic();
}
