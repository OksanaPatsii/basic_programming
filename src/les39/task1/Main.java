package les39.task1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date secondDate = new Date();
        System.out.println(secondDate);

        boolean result = currentDate.equals(secondDate);
        System.out.println(result);

        System.out.println();
        System.out.println(currentDate.getTime());
        System.out.println(secondDate.getTime());
        System.out.println(secondDate.getTime() - currentDate.getTime());


        Date date = new Date(100_000_000_000L);
        Date date1 = new Date(100_000_000_000L);

        System.out.println(date);
        System.out.println();

        System.out.println(date.equals(date1));


        Date date2 = new Date(-10_000_000_000_000L);
        System.out.println(date2);

    }
}
