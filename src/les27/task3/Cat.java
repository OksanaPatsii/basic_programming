package les27.task3;

public class Cat {
    private int age;
    private double weight;
    private String color;

    public Cat(int age, double weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}

