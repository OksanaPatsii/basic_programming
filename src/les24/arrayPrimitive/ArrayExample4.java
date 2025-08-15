package les24.arrayPrimitive;


import les17.Library.UserInput;

import java.util.Arrays;

public class ArrayExample4 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int myArraySize = userInput.getUserInteger("Geben Sie die Anzahl der Wörter ein");

        String[] stringArray = new String[myArraySize];

        System.out.println("Ein Array mit " + myArraySize + " Elementen erstellt");
        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < myArraySize; i++) {
            String currentElement = userInput.getUserText("Geben Sie das Wort ein");
            stringArray[i] = currentElement;
            System.out.println(Arrays.toString(stringArray));
        }


    }
}
