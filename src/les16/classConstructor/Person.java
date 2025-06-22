package les16.classConstructor;

public class Person {
    String name;
    String address;
    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Adresse: " + address);
    }

}
