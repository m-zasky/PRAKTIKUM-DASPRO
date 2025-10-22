import java.util.Scanner;

public class PemilihanHari18 {
    public static void main(String[] args) {

        // mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // mendeklarasikan variable
        String dayName, dayType;

        // user menginputkan
        System.out.println("Input day name");
        dayName = sc.nextLine();

        // operator switch-case
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";

        }
        System.out.println(dayName + " is a " + dayType);

    }
}
