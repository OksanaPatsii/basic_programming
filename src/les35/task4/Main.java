package les35.task4;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, String> function = Function.identity();

        String value = "Hello";
        System.out.println(function.apply(value));
    }
}
