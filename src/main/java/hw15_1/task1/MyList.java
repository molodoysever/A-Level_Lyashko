package hw15_1.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MyList <E> {
    private MyNode<E> head;
    private MyNode<E> tail;

    public void add ( E value ) {
        MyNode<E> node = new MyNode<> ( value );
        if (head == null & tail == null) {
            head = node;
            head.setNext ( tail );
            head.setPrev ( tail );
        } else {
            if (tail == null) {
                tail = node;
                tail.setNext ( head );
                tail.setPrev ( head );
            } else {
                tail.setNext ( node );
                head.setPrev ( node );
                node.setNext ( head );
                node.setPrev ( tail );
                tail = node;
            }
        }
    }

    public E getFromLast(E value) {
        if (tail == null) {
            E headValue = head.getValue();
            if (value.equals(headValue)) {
                return headValue;
            } else {
                return null;
            }
        }
        if (head == null) {
            return null;
        }

        MyNode<E> node = head.getPrev();
        do {
            E nodeValue = node.getValue();
            if (value.equals(nodeValue)) {
                return nodeValue;
            }
            node = node.getPrev();
        } while (!node.equals(tail));
        return null;
    }
}