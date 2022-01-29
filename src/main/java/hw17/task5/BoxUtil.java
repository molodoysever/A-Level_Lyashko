package hw17.task5;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BoxUtil {
    private static final Random random = new Random();
    public static List<Box> box() {
        List<Box> box = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            box.add(new Box(random.nextInt(200), list()));
        }
        return box;
    }

    public static int limit() {
        return random.nextInt(120);
    }

    public static List<Item> list() {
        List<Item> item = new LinkedList<>();
        for (int i = 0; i < random.nextInt(6); i++) {
            item.add(new Item("name" + random.nextInt(65), random.nextInt(100)));
        }
        return item;
    }
}
