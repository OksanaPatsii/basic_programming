package les25.task1;

public class Human {

    private int age;
    private double height;

    public Human(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public void run() {
        System.out.println("Mann rennt");
    }

    public void sleep() {
        System.out.println("Mann schläft");
    }
}
