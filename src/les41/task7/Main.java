package les41.task7;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("test.txt")) {

            System.out.println(in.available());

            for (int i = 0; i < 5; i++) {
                System.out.print((char) in.read());
            }
            System.out.println();

            System.out.println(in.available());

            in.skip(3);

            for (int i = 0; i < 3; i++) {
                System.out.print((char) in.read());
            }

            System.out.println();

            System.out.println(in.available());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
