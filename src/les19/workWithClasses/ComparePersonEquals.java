package les19.workWithClasses;

public class ComparePersonEquals {
    public static void main(String[] args) {
        int clientNumber1 = 1;
        int age1 = 35;

        int clientNumber2 = 1;
        int age2 = 27;

        Person person1 = new Person(clientNumber1,age1);
        Person person2 = new Person(clientNumber2,age2);

        System.out.println(person1.equals(person2));

    }
    }

