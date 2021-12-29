package module2.service;

import module2.Util;
import module2.model.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PersonService {
    Random random = new Random();
    private final List<Integer> customerNumb = new LinkedList<>();

    public Customer getNewCustomer() {
        boolean flag = false;
        int min = 1;
        int max = 1000000;
        int id;
        if (customerNumb.size() != 0) {
            do {
                id = Util.getRandomInt(min, max);
                for (Integer integer : customerNumb) {
                    if (integer == id) {
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
            } while (flag);
        } else {
            id = Util.getRandomInt(min, max);
        }
        customerNumb.add(id);
        int minBoundAge = 10;
        int maxBoundAge = 100;
        return new Customer(id, getRandomEmail(), Util.getRandomInt(minBoundAge, maxBoundAge));
    }

    private String getRandomEmail() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 8; i++) {
            int number = random.nextInt(52);
            stringBuilder.append(string.charAt(number));
        }
        stringBuilder.append("@gmail.com");
        return stringBuilder.toString();
    }
}