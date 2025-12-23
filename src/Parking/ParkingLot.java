package Parking;

public class ParkingLot {
    public static double PRICE = 70;
    private Vehicle[][] vehicle;

    public ParkingLot(int rows, int cols) {
        vehicle = new Vehicle[rows][cols];
    }

    public void show() {
        int rows = this.vehicle.length;
        int cols = this.vehicle[0].length;
        for (int i = 0; i < cols; i++) {
            System.out.print("==");
        }
        System.out.println("=");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Vehicle v = this.vehicle[i][j];
                String val = (v != null ? "#" : " ");
                String and = (j == cols - 1 ? "|\n" : "");
                System.out.print("|" + val + and);
            }

            for (int j = 0; j < cols; j++) {
                System.out.print("==");
            }
            System.out.println("=");
//            System.out.println();
        }
    }
}
