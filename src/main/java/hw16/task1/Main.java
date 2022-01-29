package hw16.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        long time = System.currentTimeMillis();
        addList(arrayList);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        addList(linkedList);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - time));
    }

    static void addList(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }
}