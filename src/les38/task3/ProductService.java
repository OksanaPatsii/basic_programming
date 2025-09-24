package les38.task3;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findByTitle(String title) throws ProductNotFoundException {
        Product product = products.stream()
                .filter(x -> x.getTitle().equals(title))
                .findFirst()
                .orElse(null);

//        if (product == null) {
//            throw new IllegalArgumentException("Produkt - " + title + " nicht gefunden");
//        }
//        return product;

        if (product == null) {
            throw new ProductNotFoundException("Produkt - " + title + " nicht gefunden");
        }
        return product;
    }
}
