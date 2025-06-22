package les16.catBirthday;

public class Cat {
    String name;
    int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printCatInfo() {
        System.out.println("name: " + name + ", Alter: " + age);
    }

    public void celebrateBirthday() {
        age++;
        System.out.println(name + " feiert ihren Geburstag! Sie ist jetzt " + age + " Jahre alt");
    }


}
