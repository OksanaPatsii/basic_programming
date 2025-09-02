package les32.task1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Rot", 3, 4.56);
        Cat cat2 = new Cat("Rot", 3, 4.56);

       boolean result = cat1 == cat2;
        System.out.println(result); // false

        result = cat1.equals(cat2);
        System.out.println(result); //true
        System.out.println(cat1.hashCode()); //-394437632
        System.out.println(cat2.hashCode()); //-394437632


    }
}