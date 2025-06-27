package les18.publicAndPrivate.home.task3;

public class Warehouse {
    private String name;
    private String address;
    private int quantity;

    public Warehouse(String name, String address, int quantity) {
        this.name = name;
        this.address = address;
        this.quantity = quantity;
    }

    public void increaseNumberOfGoods (int quantityNumber) {
        quantity += quantityNumber;
    }
    public void reduceNumberOfGoods(int quantityNumber) {
        if (quantityNumber <= quantity) {
        quantity -= quantityNumber;
        } else {
            System.out.println("Fehler: Nicht genug Waren auf Lager.");
        }
    }



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getQuantity() {
        return quantity;
    }


    public void printInfo() {
        System.out.println("Lagername: " + getName() +", Lageradresse: " + getAddress() + ", Warenmenge: " + getQuantity());
    }
}
