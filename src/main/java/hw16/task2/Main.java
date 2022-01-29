package hw16.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Принципы ООП: Не верь, не бойся, не проси";
        text = text.toLowerCase();
        text = text.replaceAll("[,:]", "");
        String[] split = text.split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : split) {
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            map.put(word, count + 1);
        }

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}