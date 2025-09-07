package les34.home;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("rot", 3.2, 5));
        cats.add(new Cat("schwarz", 2.0, 2));
        cats.add(new Cat("weiß", 3.70, 4));
        cats.add(new Cat("orange", 7.12, 5));
        cats.add(new Cat("braun", 2.0, 1));
        cats.add(new Cat("beige", 6.23, 4));
        cats.add(new Cat("golden", 1.70, 1));

        System.out.println("Liste aller Katzen");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();


        System.out.println("-------");

        System.out.println("Katzen über 3 Jahre alt");
        CatUtils.printFilteredCat(cats, new Filter() {
            @Override
            public boolean test(Cat cat) {
                return cat.getAge() > 3;
            }
        });

        System.out.println("Katzen, die mehr als 3 kg wiegen und über drei Jahre alt sind");
        CatUtils.printFilteredCat(cats, new Filter() {
            @Override
            public boolean test(Cat cat) {
                return cat.getWeight() > 3 && cat.getAge() > 2;
            }
        });

        System.out.println("Katzen über 3 Jahre alt");
        CatUtils.printFilteredCat(cats, x -> x.getAge() > 3);

        System.out.println("Katzen, die mehr als 3 kg ");
        CatUtils.printFilteredCat(cats, x -> x.getWeight() > 3);

        System.out.println("Katzen, die mehr als 3 kg wiegen und über drei Jahre alt sind");
        CatUtils.printFilteredCat(cats, x -> x.getAge() > 3 && x.getWeight() > 3);

    }
}
