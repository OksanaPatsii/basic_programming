package les33.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        Map<String, Double> products = new HashMap<>();

        products.put("Apfel", 90.0);
        products.put("Pfirsich", 190.0);
        products.put("Zitrone", 140.0);
        products.put("Orange", 220.0);
        products.put("Ananas", 310.0);
        products.put("Melone", 170.0);
        products.put("Banane", 110.0);
        System.out.println(products);

        Double price = products.get("Zitrone");
        System.out.println("Zitrone - " + price);

        products.put("Kirsche", 310.0);
        System.out.println(products);

        products.put("Pfirsich", 195.0);
        System.out.println(products);

        products.putIfAbsent("Traube", 270.0);
        System.out.println(products);

        products.putIfAbsent("Pfirsich", 400.0);
        System.out.println(products);

        System.out.println(products.size());

        System.out.println("Gibt es auf der Map eine Melone?" + products.containsKey("Melone"));

        System.out.println("Gibt es ein Produkt zum Preis von 140? " + products.containsValue(140.0));
        System.out.println("Gibt es ein Produkt zum Preis von 100? " + products.containsValue(100.0));

        System.out.println();
        System.out.println("Deleted");

        price = products.remove("Apfel");
        System.out.println("Preis des entfernten Produkts - " + price);
        System.out.println(products);

        boolean result = products.remove("Orange", 220.0);
        System.out.println(products);
        System.out.println("Wurde die Orange entfernt? " + result);

        result = products.remove("Traube", 280.0);
        System.out.println(products);
        System.out.println("Wurde die Traube entfernt? " + result);

        products.replace("Kirsche", 320.0);
        System.out.println(products);

        products.replace("Aprikose", 150.0);
        System.out.println(products);

//        products.clear();
//        System.out.println(products);

    }
}
