package hw17.task5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static hw17.task5.BoxUtil.box;
import static hw17.task5.BoxUtil.limit;

public class Main {
    public static void main(String[] args) {
        System.out.println(box());
        List<Item> sortedList = box().stream()
                .filter(box -> box.getItems().size() <= limit())
                .flatMap(box -> box.getItems().stream())
                .sorted(Comparator.comparing(Item::getCost))
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
