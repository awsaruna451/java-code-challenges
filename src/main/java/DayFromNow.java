import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Scanner;

public class DayFromNow {
    public static LocalDate calculateHundredDayFromNow(LocalDate toDay) {
        Period hundredDays = Period.ofDays(100);
        return toDay.plus(hundredDays);
    }

    public static void main(String ar[]) {
        LocalDate toDay = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println("100 days from now is::" + calculateHundredDayFromNow(toDay));
    }
}
