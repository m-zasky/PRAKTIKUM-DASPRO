import java.util.Scanner;

public class SiakadFor18 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLusus = 0;

        // perulangan for
        for (int a = 1; a <= 10; a++) {

            System.out.print("Masukan Nilai Mahasiswa ke-" + a + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // modifikasi
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLusus++;
            }
        }

        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus (nilai >= 60) : " + lulus);
        System.out.println("Jumlah Mahasiswa TidakLulus (nilai > 60): " + tidakLusus);

    }
}
