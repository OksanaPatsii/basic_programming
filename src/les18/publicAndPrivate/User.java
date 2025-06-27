package les18.publicAndPrivate;

public class User {
    String name;
    String email;
    String password;
    String idCard;

    public User(String name, String email, String password, String idCard) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.idCard = idCard;
    }

    public boolean checkPassword(String passForCompare) {
        return true;
    }
}
