import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("Date is: " + d);

        LocalTime t = LocalTime.now();
        System.out.println("Time is: " + t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Date and Time is: " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // This is the format
        String myDate = dt.format(df);
        System.out.println("Date in formatted manner: " + myDate);
    }
}
