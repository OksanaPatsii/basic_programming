package les19.workWithClasses;

public class ComparePerson {
    public static void main(String[] args) {
        int clientNumber1 = 1;
        int age1 = 35;

        int clientNumber2 = 15;
        int age2 = 27;

        Person person1 = new Person(clientNumber1,age1);
        Person person2 = new Person(clientNumber2,age2);

        if (compareObject(person1,person2)) {
            System.out.println("Zwei Objekte sind gleich");
        } else {
            System.out.println("Zwei Objekte sind unterschiedlich");
        }

    }

    public static boolean compareObject(Person p1, Person p2) {
        if ((p1.getClientNumber() == p2.getClientNumber())
                && (p1.getAge() == p2.getAge())) {
            return true;
        } else {
            return false;
        }

    }
    }

