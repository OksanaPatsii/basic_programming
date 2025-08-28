package les31.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] array = {"BBB", "EEE", "DDD", "EEE", "AAA", "CCC" };
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));

        Set<String> result1 = new LinkedHashSet<>();
        for (String value : array) {
            result1.add(value);
        }
        System.out.println(result1);

//        List<String> list = Arrays.asList(array);
//        Set<String> result2 = new LinkedHashSet<>(list);

        Set<String> result2 = new LinkedHashSet<>(Arrays.asList(array));
        System.out.println(result2);

        Set<String> result3 = new LinkedHashSet<>();
        System.out.println(result3);

        Collections.addAll(result3, array);
        System.out.println(result3);

        Set<String> result4 = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println(result4);

//        Set<String> result5 = Set.of(array);
//        System.out.println(result5);

//        Set<String> result6 = new LinkedHashSet<>(Set.of(array));
//        System.out.println(result6);
    }
}
