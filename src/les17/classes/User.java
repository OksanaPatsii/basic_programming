package les17.classes;

public class User {
    String username;
    String email;
    String password;
    boolean isActive;
    String address;
    String phone;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
