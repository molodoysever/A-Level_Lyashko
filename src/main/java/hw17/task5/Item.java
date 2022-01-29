package hw17.task5;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Item {
    private final String name;
    private final int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
