package les21.task6;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        x++;
        ++y;
        System.out.println("x-" + x + ", y-" + y);
        System.out.println(x++);
        System.out.println(++y);
        System.out.println(x);
        System.out.println(y);

        System.out.println();

        int a = x++;
        int b = ++y;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
