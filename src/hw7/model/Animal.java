package hw7.model;

import java.util.ArrayList;

public class Animal {

    private final String name;
    private final AnimalType type;
    private int age;
    private double hungry;
    private int money;
    private double clear;
    private double happy;
    private boolean isIll;
    private boolean unHungry;
    private boolean unHappy;
    private String present;
    private ArrayList<String> gift;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100.0d;
        this.money = 0;
        this.clear = 100.0d;
        this.happy = 50.0d;
        this.unHungry = true;
        this.unHappy = false;
        this.isIll = false;
        this.present = "";
        this.gift = new ArrayList<>();
    }

    public boolean isUnHappy() {
        return unHappy;
    }

    public void setUnHappy (boolean unHappy) {
        this.unHappy = unHappy;
    }

    public boolean isUnHungry() {
        return unHungry;
    }

    public void setUnHungry (boolean unHungry) {
        this.unHungry = unHungry;
    }
    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean isIll) {
        this.isIll = isIll;
    }


    public void setPresent(String present) {
        gift.add("Подарок " + present);
    }


    public int getAge() {
        return age;
    }

    public void addAge(int age) {
        this.age += age;
    }

    public void setHungry(double hungry) {
        this.hungry = hungry;
    }

    public double getHungry() {
        return hungry;
    }

    public void addHungry(double hungry) {
        this.hungry += hungry;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public double getClear() {
        return clear;
    }

    public void setClear(double clear) {
        this.clear = clear;
    }

    public void addClear(double clear) {
        this.clear += clear;
    }

    public double getHappy() {
        return happy;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    public void addHappy(double happy) {
        this.happy += happy;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", hungry=" + hungry +
                ", money=" + money +
                ", clear=" + clear +
                ", happy=" + happy +
                ", isIll=" + isIll +
                ", unHungry=" + unHungry +
                ", unHappy=" + unHappy +
                ", present='" + present + '\'' +
                ", gift=" + gift +
                '}';
    }
}
