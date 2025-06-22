package les14;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie erste Zahl");
        int x = scanner.nextInt();

        System.out.println("Geben Sie zweite Zahl");
        int y = scanner.nextInt();


        int temp = x;
        x = y;
        y = temp;

        System.out.println("Nach dem Tausch: Erste = " + x + ", Zweite = " + y);

        scanner.close();
    }
}
