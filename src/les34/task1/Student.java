package les34.task1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int course;
    private double averageRate;
    private Degree degree;

    public Student(String name, int age, int course, double averageRate, Degree degree) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.averageRate = averageRate;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public Degree getDegree() {
        return degree;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return age == student.age && course == student.course && Double.compare(averageRate, student.averageRate) == 0 && Objects.equals(name, student.name) && degree == student.degree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course, averageRate, degree);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageRate=" + averageRate +
                ", degree=" + degree +
                '}';
    }
}
