import java.util.Scanner;

public class CetakKRS18 {
    public static void main(String[] args) {

        // mendeklarasikan variable sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // user menginputkan
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // if else operator
        // if (uktLunas) {
        // System.out.println("pembayaran UKT terverivikasi");
        // System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        // } else {
        // System.out.println("Regristasi ditolak. Silahkan lunasi UKT terlebih dahulu.
        // ");
        // }

        // ternary operator
        System.out.println(uktLunas ? "pembayaran UKT terverivikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                : "Regristasi ditolak. Silahkan lunasi UKT terlebih dahulu");

    }
}
