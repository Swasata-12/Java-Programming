// Calender class ia an abstract class 
// GregorianCalender class is a concrete class

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("The year is leap year or not: " + gcal.isLeapYear(2018));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println("Current year is: " + c.get(Calendar.YEAR));
        System.out.println("Current month is: " + c.get(Calendar.MONTH));
        System.out.println("Current day is: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is: " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.getWeeksInWeekYear());
        System.out.println("Current time is: " + c.getTime());
        System.out.println(c.getTimeZone().getID());
    }
}
