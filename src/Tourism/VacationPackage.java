package Tourism;

public class VacationPackage {
        private String name;    //שם הלקוח
        private Flight flight;  //חבילת הטיסה
        private Hotel hotel;    //חבילת המלון
        private TouristAttraction touristAttraction;    //חבילת האטרקציות

        public VacationPackage(String name, Flight flight,Hotel hotel){
            this.name=name;
            this.flight=flight;
            this.hotel=hotel;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double calculation(){
            double calcul=flight.getBasicPrice()+hotel.priceForAll();
            return calcul;
    }
    @Override
    public String toString() {
        return "Hello "+name+"! \nThe vacation package reservation was successfully received! \n These are the details: The flight details are: "+
                flight.getAirline()+" to "+flight.getDestinationCity()+" number for flight "+flight.getFlightNumber()+" hotel is: "+
                hotel.getHotelName()+"Stars for hotel: "+hotel.getStors()+" The flight details are: "+ calculation()+(hotel.isBreakfast()?" Breakfast included":" Without breakfast");
    }
}
