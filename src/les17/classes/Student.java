package les17.classes;

public class Student {
    String name;
    String group;
    double math;
    double english;
    double it;
    boolean isActive;
    double avgGrade;

    public Student(String name, String group, double math, double english, double it, boolean isActive) {
        this.name = name;
        this.group = group;
        this.math = math;
        this.english = english;
        this.it = it;
        this.isActive = isActive;
    }

    public Student() {
    }
}
