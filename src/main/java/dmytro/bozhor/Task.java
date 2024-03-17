package dmytro.bozhor;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Task {
    private static void taskFive() {
        var currentDate = LocalDate.now();
        var pastDate = LocalDate.of(2018, 7, 7);

        var epochDay = currentDate.minusDays(pastDate.toEpochDay()).toEpochDay();
        System.out.println(epochDay);

//        var days = Period.between(pastDate, currentDate).getDays();
//        System.out.println(days);

//        var between = ChronoUnit.DAYS.between(pastDate, currentDate);
//        System.out.println(between);
    }

    private static void taskFour() {
        var localDateTime = taskThree();
        var offset = ZoneId.of("America/Chicago").getRules().getOffset(localDateTime);
        var instant = localDateTime.toInstant(offset);
        System.out.println(instant.toEpochMilli());
    }

    private static LocalDateTime taskThree() {
        var dateTime = "26-03-1968T09:24";
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu'T'HH:mm");
        var localDateTime = LocalDateTime.parse(dateTime, dateTimeFormatter);
        System.out.println(localDateTime);
        return localDateTime;
    }

    private static void taskTwo() {
        var now = LocalDate.now();
        var format = now.format(DateTimeFormatter.ofPattern("dd-MM-uuuu"));
        System.out.println(format);
    }

    private static void taskOne() {
        var localDateTime = LocalDateTime.of(2020, Month.JUNE, 25, 19, 47);
        var localDateTimeInThreeMonths = localDateTime.plusMonths(3);
        System.out.println(localDateTimeInThreeMonths.toLocalDate());
        System.out.println(localDateTimeInThreeMonths.toLocalTime());
    }
}