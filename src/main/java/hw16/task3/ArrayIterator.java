package hw16.task3;

import java.util.NoSuchElementException;

public class ArrayIterator {
    public static <T> java.util.Iterator<T> getIterator(final T[] array) {
        return new java.util.Iterator<>() {
            private final int count = array.length;
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (index < count) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };
    }
}
