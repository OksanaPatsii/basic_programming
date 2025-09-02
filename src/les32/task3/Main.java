package les32.task3;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Weiß", 3, 4.56));
        cats.add(new Cat("Schwarz", 7, 6.32));
        cats.add(new Cat("grau", 4, 3.72));


        Cat cat1 = new Cat("Weiß", 3, 4.56);
        Cat cat2 = new Cat("Schwarz", 7, 6.32);


    }
}
