package les18.publicAndPrivate.home.task3;

public class WarehouseDemo {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse("centralWarehouse", "Dresden", 100);
        warehouse1.printInfo();

        warehouse1.increaseNumberOfGoods(20);
        warehouse1.printInfo();

        warehouse1.reduceNumberOfGoods(30);
        warehouse1.printInfo();

        warehouse1.reduceNumberOfGoods(110);
        warehouse1.printInfo();
    }
}
