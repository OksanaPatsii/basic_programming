package les24.arrayOperations;

public class FindElementArray {
    public static void main(String[] args) {
        String[] stringsArray = {"word1", "word4", "word3", "word2", "word5"};

        String elementForSearch = "word2";

        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].equals(elementForSearch)) {
                System.out.println("Das gesuchte Element wurde im Array mit Index " + i + " gefunden");
            }
        }
    }
}
