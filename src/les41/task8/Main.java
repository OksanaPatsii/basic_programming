package les41.task8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("fruits.txt");
             OutputStream out = new FileOutputStream("copy.txt", true)) {

            while (true) {
                int data = in.read();
                if (data == -1) {
                    break;
                }
                out.write(data);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
