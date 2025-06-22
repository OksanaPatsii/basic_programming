package les15.methodsExample;

public class CatDemo {
    public static void main(String[] args) {
    Cat myCat = new Cat();
    myCat.name = "Murzik";
    myCat.age = 3;

    myCat.catMeow();

        System.out.println("Spitzname des Haustier: " + myCat.name + ", Alter: " + myCat.age);


    }
}
