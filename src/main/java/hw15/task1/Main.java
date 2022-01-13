package hw15.task1;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("123");
        myList.add("1234");
        myList.add("1235");
        myList.add("1456");
        myList.add("1257");
        myList.add("12368");
        System.out.println(myList.getFromLast("1257"));

    }
}
