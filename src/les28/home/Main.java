package les28.home;

public class Main {
    public static void main(String[] args) {

        Weeks week = Weeks.SATURDAY;
        week = Weeks.THURSDAY;


        switch (week) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Heute ist " + week.getGermanName());
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Heute ist ein freier Tag");
                break;
        }
    }

    }

