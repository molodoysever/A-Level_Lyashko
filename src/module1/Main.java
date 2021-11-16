package module1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int arrS = 0;
        while (arrS < 10) {
            if (scanner.hasNextInt()) {
                arrS = scanner.nextInt();
                if (arrS < 10) {
                    System.out.println("Number must be more than 10. Try arain: ");
                }
            } else {
                System.out.println("Enter number. Try again: ");
                scanner.next();
            }
        }

        int[] numbers = new int[arrS];
        Random random = new Random();
        int upperBound = 100;
        int lowerBound = -100;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("Choose sort type: \n" +
                "1: Ascending\n" +
                "2: Descending\n");

        int ascSort = scanner.nextInt();
        switch (ascSort) {
            case 1: {
                boolean isSorted = false;
                int buf;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < numbers.length - 1; j++) {
                        if (numbers[j] > numbers[j + 1]) {
                            isSorted = false;
                            buf = numbers[j];
                            numbers[j] = numbers[j + 1];
                            numbers[j + 1] = buf;
                        }
                    }
                }
                System.out.println(Arrays.toString(numbers));
                break;
            }
            case 2: {
                for (int j = 0; j < numbers.length - 1; j++) {
                    for (int k = j + 1; k < numbers.length; k++) {
                        if (numbers[j] < numbers[k]) {
                            int temp = numbers[k];
                            numbers[k] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
                System.out.println(Arrays.toString(numbers));
                break;
            }
        }
        for (int i = 2; i < numbers.length; i = i + 3) {
            numbers[i] = numbers[i] * numbers[i] * numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
