import java.util.Scanner;

public class Bioskop18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk keluar dari program): ");
            jumlahTiket = input.nextInt();

            // Validasi input
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan kembali.");
                continue;
            }

            if (jumlahTiket == 0) {
                break; // keluar dari perulangan jika user memasukan 0
            }

            // Hitung diskon
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; // diskon 15% jika lebih dari 10 tiket
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // diskon 10% jika lebih dari 4 tiket
            }

            // Hitung total harga setelah diskon
            double totalHarga = jumlahTiket * hargaTiket * (1 - diskon);

            // Output
            System.out.println("Jumlah tiket     : " + jumlahTiket);
            System.out.println("Harga per tiket  : Rp " + hargaTiket);
            System.out.println("Diskon           : " + (diskon * 100) + "%");
            System.out.println("Total bayar      : Rp " + totalHarga);
            System.out.println("\n");

            // Akumulasi total harian
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
        }

        // Output akhir
        System.out.println("====== Rekapitulasi Penjualan Hari Ini ======");
        System.out.println("Total tiket terjual adalah  : " + totalTiket + "tiket");
        System.out.println("Total penjualan             : Rp " + (int) totalPenjualan);
        System.out.println("=============================================");
        System.out.println("Terima kasih telah menggunakan program ini");
        System.out.println("SEMOGA HARIMU MENYENANGKAN:)");

        input.close();
    }
}