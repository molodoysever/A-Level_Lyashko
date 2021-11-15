package module1.lock;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            int array [] = new int[10];
            Lock lock = new Lock(array);
            lock.getInmutableArray()[0] = 20;
            System.out.println(Arrays.toString(lock.getInmutableArray()));
        }
    }
