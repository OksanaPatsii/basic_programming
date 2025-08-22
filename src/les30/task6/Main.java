package les30.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        MyList myList = new MyList();

        for (String el : list) {
            System.out.println(el);
        }

        for (String el : myList) {
            System.out.println(el);
        }
    }
}
