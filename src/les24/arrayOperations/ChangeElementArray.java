package les24.arrayOperations;

import java.util.Arrays;

public class ChangeElementArray {
    public static void main(String[] args) {
        int[] intsArray = {5, 2, 7, 6, 4, 25, 17};

        for (int i = 0; i < intsArray.length; i++) {
            if (intsArray[i] % 2 == 0) {
                intsArray[i] = 0;
            }
            System.out.println(Arrays.toString(intsArray));
        }
        System.out.println(Arrays.toString(intsArray));


    }
}
                // System.out.println("Das gesuchte Element wurde im Array mit Index " + i + " gefunden");
