package les31.task2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> hashSet = new HashSet<>();

        treeSet.add("CCC");
        treeSet.add("BBB");
        treeSet.add("EEE");
        treeSet.add("AAA");
        treeSet.add("DDD");
        treeSet.add("KKK");
        treeSet.add("CCC");

        linkedHashSet.add("CCC");
        linkedHashSet.add("BBB");
        linkedHashSet.add("EEE");
        linkedHashSet.add("AAA");
        linkedHashSet.add("DDD");
        linkedHashSet.add("KKK");
        linkedHashSet.add("CCC");

        hashSet.add("CCC");
        hashSet.add("BBB");
        hashSet.add("EEE");
        hashSet.add("AAA");
        hashSet.add("DDD");
        hashSet.add("KKK");
        hashSet.add("CCC");


        System.out.println(treeSet); // [AAA, BBB, CCC, DDD, EEE, KKK]
        System.out.println(linkedHashSet); // [CCC, BBB, EEE, AAA, DDD, KKK]
        System.out.println(hashSet); //[AAA, CCC, BBB, EEE, DDD, KKK]

        Set<String> newTreeSet = new TreeSet<>(linkedHashSet);
        System.out.println(newTreeSet);
    }
}
