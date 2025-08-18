package les27.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] result = generateArray(9);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(generateArray(25)));
    }

    public static int[] generateArray(int size) {
        int[] resalt = new int[size];
        for (int i = 0; i < size; i++) {
            resalt[i] = i + 1;
        }
        return resalt;
    }
}
