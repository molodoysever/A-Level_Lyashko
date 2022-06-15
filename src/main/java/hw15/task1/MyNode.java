package hw15.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MyNode <E> {
    private E value;
    private MyNode <E> next;
    private MyNode <E> prev;

    public MyNode(E value) {
        this.value = value;
    }
}
