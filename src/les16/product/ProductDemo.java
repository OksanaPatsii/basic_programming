package les16.product;

public class ProductDemo {
    public static void main(String[] args) {

        Product product1 = new Product("Sofa", 250);
        Product product2 = new Product("Lampe", 98);
        double discount = 100;

        double totalPrice = Product.getTotalPrice(product1.price, product2.price, discount);
        System.out.println("Ihr Zalungsbetrag mit einem Rabatt von " + totalPrice + " Euro");
        System.out.println("Ihr Rabattbetrag beträgt " + discount + " Euro");

    }
}
