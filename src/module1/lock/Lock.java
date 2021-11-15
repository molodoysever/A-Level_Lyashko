package module1.lock;


import java.util.Arrays;

public class Lock {
    private  final int[] Array;
    public  Lock(int[] inmutableArray) {
        this.Array = Arrays.copyOf(inmutableArray,inmutableArray.length);
    }
    public  int[] getInmutableArray() {
        return Arrays.copyOf(Array, Array.length);
    }
}