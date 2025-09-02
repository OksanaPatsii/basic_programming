package les32.task4;


import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Weiß", 3, 4.56));
        cats.add(new Cat("Schwarz", 7, 6.32));
        cats.add(new Cat("grau", 4, 3.72));

        System.out.println(cats);


        Set<Cat> cats1 = new TreeSet<>(new CatComparator());
        cats1.add(new Cat("Weiß", 3, 4.56));
        cats1.add(new Cat("Schwarz", 7, 6.32));
        cats1.add(new Cat("grau", 4, 3.72));
        cats1.add(new Cat("Rot", 4, 3.72));

        System.out.println(cats1);

    }
}
