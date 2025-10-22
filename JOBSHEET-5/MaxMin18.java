import java.util.Scanner;

public class MaxMin18 {
    public static void main(String[] args) {

        // mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi variable
        int a, b, c;
        int max, min;

        // input tiga bilangan
        System.out.println("Masukan Bilangan A: ");
        a = sc.nextInt();
        System.out.println("Masukan Bilangan B: ");
        b = sc.nextInt();
        System.out.println("Masukan Bilangan C: ");
        c = sc.nextInt();

        // menentukan bilangan maksimum dengan operator logika
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        // menentukan bilangan minimum dengan operator logika
        if (a <= b && a <= c){
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        // output hasil
        System.out.println("Bilangan maksimum adalah: " + max);
        System.out.println("Bilangan minimum adalah: "+ min);

    }
}
