package hw15.task1;

public class Main {
    public static void main ( String[] args ) {
        MyList<String> myList = new MyList<> ();

        myList.add ( "1" );
        myList.add ( "2" );
        myList.add ( "3" );
        System.out.println (myList.getFromLast ( "2" ) );
    }
}
