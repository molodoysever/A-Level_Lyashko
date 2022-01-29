package hw17.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] text = {"abcd", "basd", "sdlkf", "qwefs", "askdf"};

        ArrayList<String> arrayList = new ArrayList<>(text.length);
        for (int i=0; i<text.length; i++)
            arrayList.add(i, text[i]);

        Stream<String> stream = arrayList.stream();
        Stream<String> streamSorted = stream.sorted();

        Consumer<String> action = System.out::println;
        streamSorted.forEach(action);

        Comparator<String> comparator;
        comparator = Comparator.reverseOrder();

        stream = arrayList.stream();
        Stream<String> streamSortedDesc = stream.sorted(comparator);

        System.out.println("---");
        streamSortedDesc.forEach(action);
    }
}
