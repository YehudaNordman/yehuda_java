package Tourism;

public class Flight {
    private String airline; //חברת תעופה
    private String destinationCity; //עיר יעד
    private String flightNumber;    //מספר טיסה
    private double basicPrice;  //מחיר לכרטיס בסיסי
    private boolean isBusinessClass;    //האם הכרטיס הוא ביזנס

    public Flight(String airline, String destinationCity, String flightNumber, double basicPrice) {
        this.airline = airline;
        this.destinationCity = destinationCity;
        this.flightNumber = flightNumber;
        this.basicPrice = basicPrice;
        this.isBusinessClass = false;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getBasicPrice() {
        return Math.floor(basicPrice);
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
        if (isBusinessClass) {
            basicPrice = basicPrice * 1.60;
        }
    }

    @Override
    public String toString() {
        return "Hello! Your flight has been cancelled with the airline: " + airline + " To the city: " + destinationCity +
                " Your flight number is: " + flightNumber + " In the department: " + (!isBusinessClass ? "Tourists" : "Business")
                + " And the price is: " + basicPrice;
    }
}
