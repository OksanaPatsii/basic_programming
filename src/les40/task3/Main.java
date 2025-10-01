package les40.task3;

import les35.task2.Cat;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Eins!%nZwei!%nDrei!%n");

        int x = 7;
        int y = 5;

        System.out.printf("Die Summe der Zahlen %d und %d ist %d.%n", x, y, x + y);
        String name = "Ilona";
        System.out.printf("Hallo, %s! Schön, dich kennenzulernen.%n", name);

        double pi = Math.PI;
        System.out.printf("Die Zahl Pi = %f.%n", pi);
        System.out.printf("Die Zahl Pi = %.10f.%n", pi);
        System.out.printf("Die Zahl Pi = %.4f.%n", pi);
        System.out.printf("Die Zahl Pi = %.2f.%n", pi);

        System.out.printf("X ist kleiner als Y - %b.%n", x < y);
        System.out.printf("X ist kleiner als Y - %B.%n", x < y);

        char symbol = 'Y';

        Cat cat = new Cat("Rot", 3, 4.56);
        System.out.printf("Ich habe eine Katze - %s. Sie liebt es zu essen!%n", cat);

        int[] numbers = {1, 2, 3};
        System.out.printf("Drucken eines Arrays auf dem Bildschirm - %s.%n", Arrays.toString(numbers));

        Date date = new Date();
        Locale locale = new Locale("de");
        System.out.printf(locale, "Heute ist - %td %tB das Jahr %tY, %tA, die aktuelle Zeit ist - %tT%n.",
                date, date, date, date, date);

        System.out.printf(locale, "Heute ist - %td %1$tB das Jahr %1$tY, %1$tA, die aktuelle Zeit ist - %1$tT%n.", date);


    }
}