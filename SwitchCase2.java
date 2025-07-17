import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the day: ");
        String day = sc.nextLine();
        switch (day) {
            case "Saturday", "Sunday":
                System.out.println("Alarm is set for 6 am");
                break;
            case "Monday":
                System.out.println("Alarm is set for 8 am");
                break;
            default:
                System.out.println("Alarm is set for 5 am");
                break;
        }
    }
}
