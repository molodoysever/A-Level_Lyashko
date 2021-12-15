package hw11;

public class Main {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone(Manufacturer.SAMSUNG, Year.YEAR2010);
        MobilePhone mobilePhone = new MobilePhone(Manufacturer.APPLE, Year.YEAR2020);
        RotaryPhone rotaryPhone = new RotaryPhone(Manufacturer.XIAOMI, Year.YEAR2000);
        Service service = new Service();
        service.test(cellPhone);
        service.test(mobilePhone);
        service.test(rotaryPhone);

        int mob = mobilePhone.hashCode();
        int cell = cellPhone.hashCode();
        if (mob != cell) {
            System.out.println(false);
        } else {
            System.out.println(cellPhone.equals(mobilePhone));
        }
    }
}
