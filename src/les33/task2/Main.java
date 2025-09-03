package les33.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();

        products.put("Apfel", 90.0);
        products.put("Pfirsich", 190.0);
        products.put("Zitrone", 140.0);
        products.put("Orange", 220.0);
        products.put("Ananas", 310.0);
        products.put("Melone", 170.0);
        products.put("Banane", 110.0);

        System.out.println("Name aller Produkte:");
        for (String productsTitle : products.keySet()) {
            System.out.println(productsTitle);
        }

        System.out.println("Summe aller Preise:");

        double sum = 0.0;
        for (Double productPrice : products.values()) {
            sum += productPrice;
        }
        System.out.println("Summe aller Preise: = " + sum);

        System.out.println("Preisliste mit Produktnamen und -werten:");
        for (Map.Entry<String, Double> pair : products.entrySet()) {
            String productTitle = pair.getKey();
            Double productPrice = pair.getValue();
            System.out.println(productTitle + ": " + productPrice);
        }

        Iterator<String> keyIterator = products.keySet().iterator();
        Iterator<Double> valueIterator = products.values().iterator();
        Iterator<Map.Entry<String, Double>> pairIterator = products.entrySet().iterator();
    }
}
