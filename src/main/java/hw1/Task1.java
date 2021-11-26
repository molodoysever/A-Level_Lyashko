package hw1;

public class Task1 {
    public static void main(String[] args) {
        String str = new String("MaxLyashko");
        int count = 0;
        for (int c = 0; c<str.length(); c++) {
            count ++;
        }
        System.out.println (str +count);
        if (count > 7) {
            System.out.println("more then 7");
        } else if (count < 7){
            System.out.println("less then 7");
        }
    }
}
