package hw3;

public class Task3 {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23; hour++) {
            String hourS = hour < 10 ? "0" + hour : String.valueOf(hour);
            for (int min = 0; min <= 59; min++) {
                String minS = min < 10 ? "0" + min : String.valueOf(min);
                if (hourS.equals(minS)) {
                    StringBuilder stringBuilder = new StringBuilder(minS);
                    String minReverse = stringBuilder.reverse().toString();
                    if (Integer.valueOf(minReverse) < 60) {
                        System.out.println(("hours " + hourS) + (" mins " + minReverse));
                    }
                }
            }
        }
    }
}

