package les39.task2;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();

        long milliseconds = date.getTime();
        milliseconds += (5 * 60 + 20) * 1000;
        Date futureDate = new Date(milliseconds);
        System.out.println(date);
        System.out.println(futureDate);

        System.out.println("Datum kam vor FutureDate? - " + date.before(futureDate));
        System.out.println("FutureDate kam vor Datum? - " + futureDate.before(date));

        System.out.println(date.compareTo(futureDate));
        System.out.println(futureDate.compareTo(date));

        Set<Date> dates = new TreeSet<>();
        dates.add(new Date(100_000_000_000L));
        dates.add(new Date(50_000_000_000L));
        dates.add(new Date(30_000_000_000L));
        dates.add(new Date(250_000_000_000L));
        dates.add(new Date(150_000_000_000L));

        System.out.println("Sorted date:");
        dates.forEach(System.out::println);


    }
}
