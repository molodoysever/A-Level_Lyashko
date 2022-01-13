package hw15.task2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Box> set = new TreeSet<>(new BoxVolume());
        set.add(new Box(5));
        set.add(new Box(12));
        set.add(new Box(25));
        set.add(new Box(3));
        set.add(new Box(0));

        for (Box box : set) {
            System.out.println("Volume in Box: " + box.volume);
        }
    }
}
