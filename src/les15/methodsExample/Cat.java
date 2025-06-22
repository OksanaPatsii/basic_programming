package les15.methodsExample;

public class Cat {
    String name;
    int age;

    public void catMeow() {
        System.out.println("Meow !!!");
    }

    public void catBirthday(String textMessage) {
        System.out.println("Unsere Katze hat heute Geburtstag!");

        age = age +1;
        System.out.println("Spitzname des Haustier: " + name + ", Alter: " + age);

    }
}
