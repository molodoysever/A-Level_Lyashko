package hw16.task3;

import java.util.Iterator;

public class Main {
    public static void main ( String[] args ) {
        int[] arr = { 45, 2, 12, 1, 86 };

        Iterator<Integer> iterator = new Iterator<Integer>() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return arr.length > i;
            }

            @Override
            public Integer next() {
                return arr[i++];
            }
        };

        iterator.forEachRemaining(System.out::println);
    }
}
