import java.time.LocalDate;
import java.time.LocalDateTime;

import exercises.*;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();

        LocalDate date3 = LocalDate.of(1988, 1, 22);
        LocalDate date4 = LocalDate.parse("1993-10-16");

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
    }
}
