package les39.task5;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();

        LocalDateTime secondDate = LocalDateTime.of(2015, Month.APRIL, 10, 8, 12, 24);

        System.out.println(date);
        System.out.println(secondDate);

        LocalDateTime newDate = date.plusYears(7);
        System.out.println(newDate);

        newDate = newDate.plusHours(4).minusMinutes(2);
        System.out.println(newDate);

        Locale germanLocale = new Locale("de");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Heute ist' EEEE, d MMMM yyyy", germanLocale);

        System.out.println(formatter.format(date));
        System.out.println(formatter.format(newDate));
        System.out.println(formatter.format(secondDate));



    }
}
