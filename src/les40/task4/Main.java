package les40.task4;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File("test.txt");

        System.out.println("Existiert die Datei? - " + file.exists());

        try {
            boolean created = file.createNewFile();
            System.out.println("Wurde die Datei erstellt? - " + created);
            File dir = new File("test_folder");
            dir.mkdir();

            File innerFile = new File("test_folder/another_test.txt");
            innerFile.createNewFile();

            System.out.println(dir.isDirectory());
            System.out.println(dir.isFile());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
