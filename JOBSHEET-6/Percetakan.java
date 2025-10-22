import java.util.Scanner;
public class Percetakan{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("====PROGRAM PERCETAKAN====");

        // input
        System.out.println("Masukan Jumlah Halaman buku yang dicetak");
        int jumlahhalaman = sc.nextInt();

        // deklarasi + proses
        int biayaperhalaman = 200;
        int jumlahlembar = (int) Math.ceil((double) jumlahhalaman /2);
        int biayacetak = jumlahhalaman * biayaperhalaman;
        int beratkertas = jumlahlembar * 3;
        int berathardcover = 250;
        int beratkemasan = 300;
        int totalberat = beratkertas + berathardcover + beratkemasan;
        int totalberatkg = (int) Math.ceil((double) totalberat / 1000);
        int biayapengirim = totalberatkg * 15000;
        int totalBiaya = biayacetak + 20000 + biayapengirim;

        //Output hasil perhitungan 
        System.out.println("total biaya percetakan: Rp" + totalBiaya);
    }
}