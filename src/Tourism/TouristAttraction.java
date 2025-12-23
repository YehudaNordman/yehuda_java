package Tourism;

public class TouristAttraction {
    private String attraction; //סוג האטרקציה
    private double pricePerPerson;  //מחיר לפי בן אדם
    private double duration; //כמה זמן נשמך האטרקציה

    public TouristAttraction(String attraction, double pricePerPerson, double duration) {
        this.attraction=attraction;
        this.pricePerPerson=pricePerPerson;
        this.duration=duration;
    }

    @Override
    public String toString() {
        return "The attraction that was booked is: "+attraction+" Approximate duration of the activity: "+duration+" Price by: "+
                pricePerPerson+" For a person.";
    }
}
