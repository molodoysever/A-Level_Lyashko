package hw10.models;

import hw10.Recoverable;

public class Truck extends Car implements Recoverable {
    private final int maxCargo = 100;
    private int cargo = 0;
    private final String Type = "truck";

    public Truck(String series, int year, String color) {
        super(series, year, color);
    }

    public void setFuel(int fuel) {
        super.fuel = fuel;
    }

    public String getType() {
        return Type;
    }

    public void loadCargo(int cargo) {
        if (cargo > maxCargo - this.cargo) {
            System.out.printf("Сейчас можно загрузить не больше %d\n", maxCargo - this.cargo);
        } else if (cargo < 0) {
            System.out.println("Нет груза");
        } else {
            this.cargo += cargo;
        }
    }

    public void unloadCargo(int cargo) {
        if (cargo > this.cargo) {
            System.out.printf("Сейчас груза %d\n", this.cargo);
        } else if (cargo < 0) {
            System.out.println("Нет груза");
        } else {
            this.cargo -= cargo;
        }

    }

    @Override
    public void addFuel(int fuel) {
        this.fuel += fuel;
        isNotEmptyGas = this.fuel >= fuelConsumption * 2;
    }


    @Override
    public void move() {
        if (isNotEmptyGas) {
            addFuel(-fuelConsumption * 2);
            System.out.println("Поехали!");
        } else {
            if (fuel < fuelConsumption) {
                    System.out.println("Нет бензина");
            }
        }
    }


    @Override
    public void showStatistic() {
        System.out.printf("Series: %s\n" +
                        "Year: %d\n" +
                        "Color: %s\n" +
                        "Fuel: %d\n" +
                        "Кол-во поездок: %d \n" +
                        "Грузовик загружен %d\n",
                series, year, color, fuel, moveCount, cargo);
    }

    @Override
    public void refuel() {
        setFuel(100);
        System.out.println("Заправились");
    }
}