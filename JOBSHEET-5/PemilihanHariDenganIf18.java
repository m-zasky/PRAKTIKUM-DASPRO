import java.util.Scanner;
public class PemilihanHariDenganIf18 {
    public static void main(String[] args) {

        // mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // user menginputkan
        System.out.println("Masukan Angka");
        int dayNumber = sc.nextInt();

        // operator if else
        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("weekend");
        } else {
            System.out.println("Invalid Number");
        }

    }
}