package les28.task1;

public class Toy {

    private String id;
    private String title;
    private double price;
    private Color color;

    public Toy(String id, String title, double price, Color color) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
