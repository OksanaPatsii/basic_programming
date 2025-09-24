package les38.task3;

public class Main {

    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product("Orange", 3));
        service.addProduct(new Product("Banane", 0.99));
        service.addProduct(new Product("Pfirsich", 2.50));

        try {
            Product product = service.findByTitle("Banane");
            System.out.println(product.getTitle() + " kosten - " + " " + product.getPrice());

            product = service.findByTitle("Lemon");
            System.out.println(product.getPrice());

        } catch (ProductNotFoundException e) {
            System.out.println("Fehler - " + e.getMessage());
        }
    }
}
