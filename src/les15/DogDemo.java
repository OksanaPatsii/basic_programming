package les15;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name = "Barbos";
        dog1.age =  3;
        dog1.weight = 50.5;

        System.out.println("Dog's nickname:" + dog1.name + ", age: " + dog1.age + ", weight " + dog1.weight);


        Dog dog2 = new Dog();

        dog2.name = "Barsik";
        dog2.age =  4;
        dog2.weight = 20.4;

        System.out.println("Dog's nickname:" + dog2.name + ", age: " + dog2.age + ", weight " + dog2.weight);

    }
}
