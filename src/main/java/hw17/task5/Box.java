package hw17.task5;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString

public class Box {
    private final int size;
    private final List<Item> items;

    public Box (int size, List<Item> items) {
        this.size = size;
        this.items = items;
    }
}
