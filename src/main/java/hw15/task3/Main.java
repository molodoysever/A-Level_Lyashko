package hw15.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Max");
        strings.add("Lyashko");
        strings.add("Jedai");
        System.out.println(Util.stringIntegerMap(strings));
    }
}
