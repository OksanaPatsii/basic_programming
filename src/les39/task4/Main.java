package les39.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.HOUR));

        calendar.set(Calendar.YEAR, 2030);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.HOUR_OF_DAY, 17);

        Locale germanLocale = new Locale("de");
        SimpleDateFormat formatter = new SimpleDateFormat("'Heute ist' EEEE, d MMMM yyyy", germanLocale);

        System.out.println(formatter.format(calendar.getTime()));

        calendar.add(Calendar.YEAR, 3);
        calendar.add(Calendar.DATE, -2);
        calendar.add(Calendar.MONTH, -4);
        System.out.println(formatter.format(calendar.getTime()));



    }
}
