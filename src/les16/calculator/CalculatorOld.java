package les16.calculator;

public class CalculatorOld {

    int result;

    public void add(int x, int y) {
        int result = x + y;
        System.out.println("Additionsergebnis " + x + " und die Zahl " + y + " ist gleich " + result );
    }

    public void sub(int x, int y) {
        int result = x - y;
        System.out.println("Subtraktion " + x + " und die Zahl " + y + " ist gleich " + result );
    }
}
