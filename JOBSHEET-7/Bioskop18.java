import java.util.Scanner;

public class Bioskop18 {
    public static void main(String[] args) {

        // mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;

        System.out.println("=========================");
        System.out.println("PROGRAM TIKET BIOSKOP");
        System.out.println("=========================");

        // validasi input negatif
        do {
            System.out.print("Masukan Jumlah Tiket Yang Dibeli : ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input Tidak Valid! Harap Masukan Jumlah Tiket Yang Benar");
            }

        } while (jumlahTiket < 0);

        double total = jumlahTiket * hargaTiket;
        double diskon = 0;

        // diskon
        if (jumlahTiket > 10) {
            diskon = 0.15;
        } else if (jumlahTiket > 4) {
            diskon = 0.10;
        }

        // perhitungan total
        total = total - (total * diskon);

        System.out.println("Total Penjualan Hari Ini : Rp " + (int) total);

        sc.close();

    }
}
