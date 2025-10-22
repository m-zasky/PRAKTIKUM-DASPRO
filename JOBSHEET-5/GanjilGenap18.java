import java.util.Scanner;

public class GanjilGenap18 {
    public static void main(String[] args) {

        // mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi angka
        int angka;

        // input dari user
        System.out.println("Masukan Angka: ");
        angka = sc.nextInt();

        // if else untuk menentukan ganjil genap
        if (angka % 2 == 0) {
            System.out.println("Angka" + angka + "adalah bilangan genap");
        } else {
            System.out.println("Angka" + angka + "adalah bilangan ganjil");
        }

        // System.out.println("angka" + angka + "adalah bilangan" + (angka % 2 == 0 ? "genap" : "ganjil"));
    }

}
