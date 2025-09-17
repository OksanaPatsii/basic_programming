package les37.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[][] numbers2d = {{1, 2, 3, 4},
                {5, 6},
                {7, 8}};

        // keine Streams
        System.out.println("Array ohne Streams");
        List<Integer> list = new ArrayList<>();
        for (int[] row : numbers2d) {
            for (int cell : row) {
                list.add(cell);
            }
        }

        int[] numbers = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            numbers[i] = list.get(i);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        // mit Stream- und Flat-Map-Methode
        System.out.println("mit Stream- und Flat-Map-Methode");

        int[] numbers1 = Arrays
                .stream(numbers2d)
                .flatMapToInt(x -> Arrays.stream(x))
                // .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(numbers1));
    }
}
