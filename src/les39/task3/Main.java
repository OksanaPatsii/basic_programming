package les39.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        // System.out.println(calendar);

        Locale germanLocale = new Locale("de");
        SimpleDateFormat formatter = new SimpleDateFormat("'Heute ist' EEEE, d MMMM yyyy", germanLocale);
        Date date = calendar.getTime();
        String dateAsString = formatter.format(date);
        System.out.println(dateAsString);

        System.out.println(formatter.format(calendar.getTime()));



    }
}
