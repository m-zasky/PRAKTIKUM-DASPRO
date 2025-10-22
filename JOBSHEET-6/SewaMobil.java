import java.util.Scanner;

public class SewaMobil {
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
