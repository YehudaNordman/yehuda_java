package shop_27_25;

public class Shop1 {
    int price, inventory;
    String product, supplier;
    boolean order_again;

    public void new_inventory(int num) {
        inventory -= num;
    }

    public Shop1(int price, int inventory, boolean order_again) {
        this.price = price;
        this.inventory = inventory;
        this.order_again = order_again;
    }
}
