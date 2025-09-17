package les37.task3;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> products = List.of("Gurken", "Tomaten", "Brot", "Ketchup", "Fleisch");
        List<String> forBarbeque = List.of("Mangal", "Holzkohle", "Fleisch");
        List<String> drinks = List.of("Saft", "Wasser", "Fanta");

        Set<List<String>> allLists = Set.of(products,forBarbeque, drinks);
        Set<String> purchases = allLists
                .stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toSet());
        System.out.println(purchases);
    }
}
