package les27.task2;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"Apfel", "Birne", "Orange", "Zitrone", "Pfirsich"};

        printArray(fruits);

    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ". " + array[i]);
        }
    }
}
