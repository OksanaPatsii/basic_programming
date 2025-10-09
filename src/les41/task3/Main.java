package les41.task3;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("test.txt")) {
            System.out.println((char) in.read());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
