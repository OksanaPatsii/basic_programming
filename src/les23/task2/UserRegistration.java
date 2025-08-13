package les23.task2;

import les17.Library.UserInput;

public class UserRegistration {
    public static void main(String[] args) {

        int totalUserCounter = 0;


        UserService userService = new UserService();

        User user1 = userService.createUser();

        totalUserCounter = userService.registration(user1,totalUserCounter);
        System.out.println("insgesamt sind " + totalUserCounter +" Benutzer registriert");

        User user2 = userService.createUser();
        totalUserCounter = userService.registration(user2,totalUserCounter);
        System.out.println("insgesamt sind " + totalUserCounter +" Benutzer registriert");

    }
}
