package hw17.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    private static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(Collections.unmodifiableList(list));

        IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
        for (Integer num : list) {
            if (num >= 0) {
                intSummaryStatistics.accept(num);
            }
        }
        System.out.println(intSummaryStatistics);
    }
}
