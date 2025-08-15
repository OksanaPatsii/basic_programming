package les25.task1;

public class Student {
    private int age;
    private double height;
    private String schoolName;
    private int course;

    public Student(int age, double height, String schoolName, int course) {
        this.age = age;
        this.height = height;
        this.schoolName = schoolName;
        this.course = course;
    }

    public void study() {
        System.out.println("Student studiert");
    }

    public void run() {
        System.out.println("Mann rennt");
    }

    public void sleep() {
        System.out.println("Mann schläft");
    }
}
