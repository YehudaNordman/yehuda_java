package Tourism;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Flight fl1 = new Flight("el-al", "new-york", "F187", 2008.9);
        Flight fl2 = new Flight("el-al", "new-york", "F187", 2008.9);
        fl2.setBusinessClass(true);
        Hotel ho1 = new Hotel("nordman", 5, 5, 250);
        ho1.setBreakfast(true);
        Hotel ho2 = new Hotel("nordman", 7, 5, 250);
        System.out.println("ho2: " + ho2);
        ho2.changeNumberOfNights(2);
        TouristAttraction to1 = new TouristAttraction("jerosalem", 200, 60);
        VacationPackage yu=new VacationPackage("Yehuda", fl1,ho1);
        System.out.println("to1: " + to1);
        System.out.println("ho1: " + ho1);
        System.out.println("ho2: " + ho2);
        System.out.println("fl1: " + fl1);
        System.out.println("fl2: " + fl2);
        System.out.println("yu: "+yu);
    }
}

