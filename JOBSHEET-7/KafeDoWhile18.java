import java.util.Scanner;

public class KafeDoWhile18 {
    public static void main(String[] args) {

        // mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        // perulangan do-while
        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal untuk keluar'): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan");
                break; // keluar dari transaksi jika menginputkan "batal"
            }

            System.out.print("Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh : ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti : ");
            roti = sc.nextInt();

            // perhitungan
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total Yang Harus Dibayar : Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua Transaksi Selesai");

    }
}
