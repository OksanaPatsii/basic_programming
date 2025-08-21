package les29.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(5);
        numbers.add(9);
        numbers.add(71);
        numbers.add(56);

        System.out.println(numbers);

        numbers.add(2, 10);
        System.out.println(numbers);

        for (Integer number : numbers) {
            System.out.println(number);

        }

        numbers.set(2, 110);
        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);

        numbers.remove(new Integer(5));
        System.out.println(numbers);


        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(71);
        numbers1.add(56);

        numbers.removeAll(numbers1);
        System.out.println(numbers);


        numbers1.clear();
        System.out.println(numbers1);

        System.out.println(numbers.size());

        numbers.add(7);
        numbers.add(5);
        numbers.add(9);
        numbers.add(71);
        numbers.add(56);
        System.out.println(numbers);
        System.out.println(numbers.lastIndexOf(71));

        System.out.println(numbers.isEmpty());
        System.out.println(numbers1.isEmpty());

        System.out.println(numbers.get(2));
        System.out.println(numbers.contains(9));

    }
}
