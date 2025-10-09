package les41.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        InputStream in = null;
        try {
            // InputStream in = new FileInputStream("test.txt");

            File file = new File("test.txt");
            in = new FileInputStream(file);

            System.out.println((char) in.read());

        } catch (Exception e) {
            System.err.println("Fehler! " + e.getMessage());
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
