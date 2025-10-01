package les40.task5;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("test.txt");

            int data = in.read();
            char symbol = (char) data;
            System.out.println(symbol);

        } catch (Exception e) {
            System.err.println(e.getMessage());        }
    }
}
