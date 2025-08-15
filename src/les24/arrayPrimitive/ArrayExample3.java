package les24.arrayPrimitive;

import java.util.Arrays;

public class ArrayExample3 {
    public static void main(String[] args) {

        int[] firstArray = {10,20,30,40,50,60,70,80,90,100};

        System.out.println(Arrays.toString(firstArray));
        System.out.println(firstArray.length);

        int[] secondArrayWitLoop = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            secondArrayWitLoop[i] = firstArray[i] / 10;
        }

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArrayWitLoop));
    }
}
