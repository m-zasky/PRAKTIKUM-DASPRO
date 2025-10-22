import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        // mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int jarakTempuh,
                lamaSewa,
                hargaSewaSupir = 200000,
                biayaBahanBakar = 1000,
                hargaSewaMobil = 300000,
                totalBiaya;

        System.out.println("=====PROGRAM SEWA MOBIL=====");

        // input (agar user bisa menginputkan di terminal)
        System.out.println("Masukan lama sewa (dalam hari)");
        lamaSewa = sc.nextInt();
        System.out.println("Masukan jarak tempuh (dalam km)");
        jarakTempuh = sc.nextInt();

        // proses
        biayaBahanBakar = biayaBahanBakar * jarakTempuh;
        hargaSewaSupir = hargaSewaSupir * lamaSewa;
        hargaSewaMobil = hargaSewaMobil * lamaSewa;
        totalBiaya = hargaSewaMobil + biayaBahanBakar + hargaSewaSupir;

        if (totalBiaya > 2000000) {
            double diskon = 0.05 * totalBiaya;
            totalBiaya = totalBiaya - (int) diskon;
            System.out.println("___Selamat Anda Mendapatkan Diskon 5% ___");
            System.out.println("Jumlah Diskon =" + (int) diskon);
            System.out.println("(total sewa lebih dari Rp.2000.000)");
        } else {
            System.out.println("___Mohon Maaf Anda Tidak Dapat Diskon___");
            System.out.println("(total sewa kurang dari Rp.2000.000)");
        }

        // output atau hasil
        System.out.println("\n===== RINCIAN BIAYA SEWA =====");
        System.out.println("Lama sewa: " + lamaSewa + " hari");
        System.out.println("Jarak tempuh: " + jarakTempuh + " km");
        System.out.println("Biaya bahan bakar: Rp" + biayaBahanBakar);
        System.out.println("Biaya sewa mobil: Rp" + hargaSewaMobil);
        System.out.println("Biaya sewa supir: Rp" + hargaSewaSupir);
        System.out.println("--------------------------------");
        System.out.println("Total biaya keseluruhan: Rp" + totalBiaya);
    }
}
