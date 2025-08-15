package les24.arrayOperations;


import les17.Library.UserInput;

import java.util.Arrays;

public class CreateAndFillArray {
    public static void main(String[] args) {


        UserInput userInput = new UserInput();

        int[] intArray = new int[7];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = userInput.getUserInteger("Geben Sie das Array-Element mit dem Index " + i + " ein");
            System.out.println(Arrays.toString(intArray));
        }
    }
}
