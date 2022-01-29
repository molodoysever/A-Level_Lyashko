package hw17.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        boolean match = Stream.of("2021/12/12", "2020/12/12", "2019/12/12").
                map(data -> LocalDate.parse(data, dateTimeFormatter)).
                anyMatch(localDate -> localDate.getYear() == 2021);
        System.out.println(match);
    }
}
