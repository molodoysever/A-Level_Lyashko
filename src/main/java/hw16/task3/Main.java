package hw16.task3;

import java.util.Iterator;
import static hw16.task3.ArrayIterator.getIterator;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{3, 6, 5, 7, 4, 5};
        Double[] doubles = new Double[]{0.1, 0.2, 0.3};

        Iterator<Integer> integerIterator = getIterator(integers);

        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        Iterator<Double> doubleIterator = getIterator(doubles);
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }
    }
}
