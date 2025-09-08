package les35.task5;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // [AAA, BBBB, CC, BBBB] -> Set -> [AAAAAA, BBBBBBBB, CCCC]
        // [AAA, BBBB, CC, BBBB] -> Set -> [AAA 3, BBBB 4, CC 2]

        String[] array = {"AAA", "BBBB", "CC", "BBBB"};
        System.out.println("Quellarray");
        System.out.println(Arrays.toString(array));
        System.out.println(

        );
        System.out.println("Beispiel 1");
        // [AAA, BBBB, CC, BBBB] -> Set -> [AAAAAA, BBBBBBBB, CCCC]

        Set<String> result1 = generateSetFromArray(array, x -> x + x);
        System.out.println(result1);
        System.out.println();

        System.out.println("Beispiel 2");

        Set<String> result2 = generateSetFromArray(array, x -> x + " " + x.length());
        System.out.println(result2);
        System.out.println();

        System.out.println("Beispiel 3");
        Set<String> result3 = generateSetFromArray(array, Function.identity());
        System.out.println(result3);
    }

    public static Set<String> generateSetFromArray(String[] array, Function<String,String> function) {
        Set<String> result = new LinkedHashSet<>();
        for (String element : array) {
            String processedElement = function.apply(element);
            result.add(processedElement);
        }
        return result;
    }
}
