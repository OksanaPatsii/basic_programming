package les28.task3;

import les28.task1.Color;

public class Main {
    public static void main(String[] args) {

        Color color = Color.GREEN;

        switch (color) {
            case RED:
                System.out.println("Das ist rote Farbe");
                break;
            case GREEN:
                System.out.println("Das ist grüne Farbe");
                break;
            case BLUE:
                System.out.println("Dies ist die blaue Farbe");
                break;
        }
    }
}
