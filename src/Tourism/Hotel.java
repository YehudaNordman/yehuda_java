package Tourism;

public class Hotel {
    private String hotelName;   //שם המלון
    private int stors;  //מספר כוכבים שבמלון
    private int numberOfNights;  //כמות לילות
    private double priceForNight;   //מחיר ללילה
    private boolean breakfast;   //האם ארוחת בוקר כלולה

    public Hotel(String hotelName, int stors, int numberOfNights, double priceForNight) {
        this.hotelName = hotelName;
        if (stors > 5) System.out.println("stors is to math");
        else if (stors<1) System.out.println("stors is abnormal");
        else this.stors = stors;
        this.numberOfNights = numberOfNights;
        this.priceForNight = priceForNight;
        this.breakfast = false;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getStors() {
        return stors;
    }

    public void setStors(int stors) {
        if (stors > 5) System.out.println("stors is to math");
        this.stors = stors;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;

    }

    public double getPriceForNight() {
        return priceForNight;
    }

    public void setPriceForNight(double priceForNight) {
        this.priceForNight = priceForNight;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;

    }

    public double priceForAll() {
        double pri = priceForNight * numberOfNights;
        if (breakfast) {
            pri += (numberOfNights * 50);
        }
        return pri;
    }

    public int changeNumberOfNights(int num) {
        numberOfNights = numberOfNights + num;
        return numberOfNights;
    }

    @Override
    public String toString() {
        return (!breakfast ? "pei for Hotel: " + priceForAll() + " for: " + priceForNight + " * " + numberOfNights :
                "pei for Hotel: " + priceForAll() + " for: " + priceForNight + " * " + numberOfNights + " and for breakfast: " +
                        numberOfNights + " * 50");
    }
}
