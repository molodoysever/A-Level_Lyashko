package module2;

import java.util.Random;

public class Util extends Analytics {
    private static final Random random = new Random();

    public static int getRandomInt (int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static boolean isBlank (String string) {
        return string == null || string.trim().isEmpty();
    }
}
