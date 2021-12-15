package hw11;

public class Service {
    public String error(Phone phone) {
        if (phone.call() == null) {
            return "call error";
        }
        if (phone.charge() == null) {
            return "charge error";
        } else {
            return "ok";
        }
    }

    public void metdods(Phone phone){
        if (phone instanceof MobilePhone) {
            MobilePhone mobilePhone = (MobilePhone) phone;
            mobilePhone.photo();
        }
        if (phone instanceof CellPhone) {
            CellPhone cellPhone = (CellPhone) phone;
            cellPhone.flashlight();
        }
        if (phone instanceof RotaryPhone) {
            RotaryPhone rotaryPhone = (RotaryPhone) phone;
            rotaryPhone.ring();
        }
    }

    public void test (Phone phone) {
        String result = error(phone);
        if (result.equals(error(phone))) {
            phone.call();
            phone.charge();
            phone.menu();
            phone.app();
            metdods(phone);
        } else {
            System.out.println("OK");
        }
    }
}
