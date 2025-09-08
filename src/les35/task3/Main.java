package les35.task3;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // "5.4" -> 5.4 -> 5 -> 25;
        // "8.7" -> 8.7 -> 9 -> 81;

        String value1 = "5.4";
        String value2 = "8.7";

        Function<String, Long> function = x -> {
            double result1 = Double.parseDouble(x); // "5.4" -> 5.4
            long result2 = Math.round(result1); // 5.4 -> 5
            long result3 = result2 * result2; // 5 -> 25
            return result3;
        };

        System.out.println("Ergebnisse der 1 Methode:");
        System.out.println("Ergebnis 1 - " + function.apply(value1));
        System.out.println("Ergebnis 2 - " + function.apply(value2));
        System.out.println();

        System.out.println("Ergebnisse der 2 Methode:");
        Function<String, Double> function1 = x -> Double.parseDouble(x);
        System.out.println(function1.apply("12.34") + 5);

        Function<Double, Long> function2 = x -> Math.round(x);
        System.out.println(function2.apply(15.67));

        Function<Long, Long> function3 = x -> x * x;
        System.out.println(function3.apply(11L));
        System.out.println();

        Function<String, Long> targetFunction = function1.andThen(function2).andThen(function3);
        System.out.println("Ergebnis 1 - " + targetFunction.apply(value1));
        System.out.println("Ergebnis 2 - " + targetFunction.apply(value2));
        System.out.println();

        System.out.println("Ergebnisse der 3 Methode:");
        Function<String, Long> targetFunction1 = function2.andThen(function3).compose(function1);
        System.out.println("Ergebnis 1 - " + targetFunction1.apply(value1));
        System.out.println("Ergebnis 2 - " + targetFunction1.apply(value2));
        System.out.println();


    }
}
