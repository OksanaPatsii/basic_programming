package les25.task2;

public class Student extends Human {

    public void study() {
        System.out.println("Student studiert");
    }

    @Override
    public void run() {
        System.out.println("Student rennt");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Ich habe nicht gut geschlafen, weil ich Hausaufgaben hatte");

    }
}
