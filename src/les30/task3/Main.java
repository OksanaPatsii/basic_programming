package les30.task3;

import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //Vector ist eine ältere Version von "List".

        Vector<Integer> numbers = new Vector<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(6);
        numbers.add(8);
        numbers.add(14);

        // Enumeration ist eine Legacy-Version des Iterators
        // Die Methode elements() ist das Äquivalent
        // der Methode iterator() in modernen Sammlungen.
        Enumeration<Integer> enumeration = numbers.elements();

        // Die Methode hasMoreElements() ist ein Analogon
        // der Methode hasNext() in einem modernen Iterator.
        while (enumeration.hasMoreElements()) {

            // Die Methode nextElement() ist analog zur Methode
            // next() in einem modernen Iterator.
            Integer currentElement = enumeration.nextElement();
            System.out.println(currentElement);
        }

    }
}
