import java.util.Scanner;

public class CetakKRS18 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("pembayaran UKT terverivikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Regristasi ditolak. Silahkan lunasi UKT terlebih dahulu. ");
        }
        
    }

}