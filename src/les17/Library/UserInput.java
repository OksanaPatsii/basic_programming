package les17.Library;

import java.util.Scanner;

public class UserInput {
    public String getUserText(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();
        return userText;
    }


    public int getUserInteger(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int userInteger = scanner.nextInt();
        return userInteger;
    }


    public double getUserDouble(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        double userDouble = scanner.nextDouble();
        return userDouble;

    }
}
