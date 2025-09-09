package les32.task4;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String color;
    private int age;
    private double weight;

    public Cat(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
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

    @Override
    public int compareTo(Cat anotherCat) {
        return this.age - anotherCat.age;
    }
}
