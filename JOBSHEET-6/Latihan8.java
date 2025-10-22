import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("====PROGRAM PERCETAKAN====");

        // Input jumlah halaman
        System.out.print("Masukkan jumlah halaman buku yang dicetak: ");
        int jumlahHalaman = sc.nextInt();

        // Input jenis cover
        System.out.print("Masukkan jenis cover (hard/soft): ");
        String jenisCover = sc.next().toLowerCase(); // .toLowerCase agar input bisa fleksibel (Hard/hard/HaRd)

        // Deklarasi variabel dasar
        int biayaPerHalaman = 200;
        int jumlahLembar = (int) Math.ceil((double) jumlahHalaman / 2);
        int biayaCetak = jumlahHalaman * biayaPerHalaman;
        int beratKertas = jumlahLembar * 3;
        int beratCover, biayaCover;

        // Menentukan biaya dan berat cover berdasarkan input
        if (jenisCover.equals("hard")) {
            biayaCover = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft")) {
            biayaCover = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis cover tidak valid! Gunakan 'hard' atau 'soft'.");
            return; // keluar dari program
        }

        // Perhitungan berat dan biaya pengiriman
        int beratKemasan = 300;
        int totalBerat = beratKertas + beratCover + beratKemasan;
        int totalBeratKg = (int) Math.ceil((double) totalBerat / 1000);
        int biayaPengiriman = totalBeratKg * 15000;

        // Total biaya keseluruhan
        int totalBiaya = biayaCetak + biayaCover + biayaPengiriman;

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jenis cover: " + jenisCover);
        System.out.println("Total berat: " + totalBerat + " gram (" + totalBeratKg + " kg)");
        System.out.println("Biaya pengiriman: Rp" + biayaPengiriman);
        System.out.println("Total biaya percetakan: Rp" + totalBiaya);
    }
}
