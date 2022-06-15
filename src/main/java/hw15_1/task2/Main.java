package hw15_1.task2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main ( String[] args ) {
        SortedSet <Box> set = new TreeSet<>( new BoxVolume () );
        set.add ( new Box ( 1 ) );
        set.add ( new Box ( 4 ) );
        set.add ( new Box ( 2 ) );
        set.add ( new Box ( 5 ) );
        set.add ( new Box ( 0 ) );
        set.add ( new Box ( 3 ) );

        for (Box box : set) {
            System.out.println ("Volume " + box.volume );
        }
    }
}
