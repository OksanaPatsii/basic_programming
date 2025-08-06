package les19.workWithClasses;

import java.util.Objects;

public class Person {
    private int clientNumber;
    private int age;

    public Person(int clientNumber, int age) {
        this.clientNumber = clientNumber;
        this.age = age;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person anoutherPerson)) return false;
        return clientNumber == anoutherPerson.clientNumber && age == anoutherPerson.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientNumber, age);
    }
}
