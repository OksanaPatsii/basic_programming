package les18.publicAndPrivate.product;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("iPhone", "Aple", 1999, false);

    product.printInfo();

        System.out.println("Feldwert 'productName': " + product.returnValueProductName());

    product.changeIsDiscount(true);
    product.printInfo();

        System.out.println("Jetzt ist der Feldwert 'isDiscount': " + product.returnValueIsDiscount());


    }
}