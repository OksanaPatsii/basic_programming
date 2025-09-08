package les35.task1;

public class Main {
    public static void main(String[] args) {


        double number1 = 5.2;
        double number2 = 7.6;
        MyFunction function1 = new MyRoundFunction();
        long result1 = function1.getResult(number1);
        long result2 = function1.getResult(number2);
        System.out.println("Ergebnisse der ersten Methode");
        System.out.println("Ergebnis 1 - " + result1);
        System.out.println("Ergebnis 2 - " + result2);
        System.out.println();

        System.out.println("Ergebnisse der 2 Methode. " +
                "Verwenden einer anonymen Klasse");
        MyFunction function2 = new MyFunction() {
            @Override
            public Long getResult(Double value) {
                System.out.println("Der übergebene Wert ist - " + value);
                return Math.round(value);
            }
        };

        result1 = function2.getResult(number1);
        result2 = function2.getResult(number2);
        System.out.println("Ergebnisse der 2 Methode");
        System.out.println("Ergebnis 1 - " + result1);
        System.out.println("Ergebnis 2 - " + result2);
        System.out.println();


        System.out.println("Ergebnisse der 3 Methode. " +
                "Verwenden eines Lambda-Ausdrucks");

        MyFunction function3 = x -> {
            System.out.println("Der übergebene Wert ist - " + x);
            return Math.round(x);
        };
        result1 = function3.getResult(number1);
        result2 = function3.getResult(number2);
        System.out.println("Ergebnisse der 3 Methode");
        System.out.println("Ergebnis 1 - " + result1);
        System.out.println("Ergebnis 2 - " + result2);
        System.out.println();
    }
}
