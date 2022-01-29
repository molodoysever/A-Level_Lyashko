package hw17.task4;

import java.util.*;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        System.out.println(numbers.stream().reduce(BinaryOperator.minBy(Integer::compareTo)));
    }
}
