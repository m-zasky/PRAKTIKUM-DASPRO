// untuk memanggil scanner
import java.util.Scanner;
public class TarifListrik{
    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int kwh,
        biayaBulanan = 50000,
        tarif = 1500;
        double ppn = 0.1,
        total; 

        System.out.println("====PROGRAM TARIF LISTRIK====");

        // input (agar user bisa menginputkan di terminal)
        System.out.println("Total Biaya Berdasarkan Jumlah kWh :");
        kwh = sc.nextInt();

        // proses
        ppn = ppn * (biayaBulanan + (kwh * tarif));
        total = (kwh * tarif) + ppn;

        //Output total tagihan Listrik
        System.out.println("total tagihan listik Rp" + total);

    }
}