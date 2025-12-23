package shop_27_25;

public class shop2 {
    public static void main(String[] args) {
        Shop1 sh1 = new Shop1(250, 30, true);
//        sh1.price = 250;
//        sh1.inventory = 30;
//        sh1.product = "shirt";
//        sh1.supplier = "yehuda";
//        sh1.order_again = true;

        Shop1 sh2 = new Shop1(30, 30, false);
//        sh2.price = 30;
//        sh2.inventory = 30;
//        sh2.product = "A pair of socks";
//        sh2.supplier = "yehuda";
//        sh2.order_again = false;
        sh1.new_inventory(7);
        System.out.println(sh2.inventory);
        System.out.println(sh1.inventory);
        System.out.println(sh2.product + " " + sh2.order_again);
    }
}
