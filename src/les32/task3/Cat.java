package les32.task3;

import java.util.Objects;

public class Cat {
    private String color;
    private int age;
    private double weight;

    public Cat(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && Double.compare(weight, cat.weight) == 0 && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
