package les41.task4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class Main {

    public static void main(String[] args) {
//
//        try (InputStream inputStream = new FileInputStream("test.txt");
//             BufferedInputStream in = new BufferedInputStream(inputStream)) {

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("test.txt"))) {
            byte[] bytes = in.readNBytes(5);
            for (byte b : bytes) {
                System.out.print((char) b);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
