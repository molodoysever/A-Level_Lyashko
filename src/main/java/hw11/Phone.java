package hw11;

import java.util.Objects;

public abstract class Phone implements PhoneMenu {
    Manufacturer manufacturer;
    Year year;

    public Phone(Manufacturer manufacturer, Year year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    abstract public String call();
    abstract public String charge();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return manufacturer == phone.manufacturer && year == phone.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, year);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer=" + manufacturer +
                ", year=" + year +
                '}';
    }
}
