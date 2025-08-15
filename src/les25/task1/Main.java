package les25.task1;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human(25, 1.74);
        Human human2 = new Human(32, 1.82);

        human1.run();
        human1.sleep();

        human2.run();
        human2.sleep();


        Student student1 = new Student(22, 1.67, "AIT", 2);

        student1.study();

    }
}
