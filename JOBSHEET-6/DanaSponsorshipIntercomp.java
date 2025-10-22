// untuk memanggil scanner
import java.util.Scanner;
public class DanaSponsorshipIntercomp {
    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int jumlahTim, biayaPublikasi = 300000,
        biayaDekorasi = 500000,
        biayaKonsumsiPanitiaJuri = 500000,
        biayaHadiah = 4000000,
        biayaOperasionalLain = 500000,
        biayaKonsumsiPesertaPerOrang = 25000,
        honorariumJuriPerJudul = 75000,
        biayaPendaftaranPerTim = 50000,
        jumlahPesertaPerTim = 3,
        totalPeserta, totalKonsumsiPeserta, totalHonorariumJuri, totalPendaftaran, totalAnggaran;
        
        double presentaseDanaPolinema = 0.6, danaPolinema, danaSponsorship;

        System.out.println("====PROGRAM DANA SPONSHORSHIP====");

        // agar user bisa menginputkan di terminal
        System.out.print("Masukkan jumlah tim yang mengikuti Intercomp: ");
        jumlahTim = sc.nextInt();


        // prosesHitungKomponenVariabel
        totalPeserta = jumlahTim * jumlahPesertaPerTim;
        totalKonsumsiPeserta = totalPeserta * biayaKonsumsiPesertaPerOrang;
        totalHonorariumJuri = jumlahTim * honorariumJuriPerJudul;
        totalPendaftaran = jumlahTim * biayaPendaftaranPerTim;

        // prosesHitungTotalAnggaran
        totalAnggaran = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitiaJuri +
                biayaHadiah + biayaOperasionalLain +
                totalKonsumsiPeserta + totalHonorariumJuri;

        // prosesHitungDanadDariPolinema
        danaPolinema = presentaseDanaPolinema * totalAnggaran;

        // prosesHitungDanaSponsorship
        danaSponsorship = totalAnggaran - danaPolinema - totalPendaftaran;

        // Output
        System.out.println("Dana yang perlu dipenuhi melalui sponsorship: Rp " + danaSponsorship);
    }
}