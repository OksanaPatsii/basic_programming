package les16.calculator;

public class CalculatorOldDemo {
    public static void main(String[] args) {
        CalculatorOld calculatorOld = new CalculatorOld();

        calculatorOld.add(5, 9);

        int sumResult = calculatorOld.result;
        System.out.println(sumResult);


        calculatorOld.sub(15, 9);

        int subResult = calculatorOld.result;
        System.out.println(subResult);
    }
}
