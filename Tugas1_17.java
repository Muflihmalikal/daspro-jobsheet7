import java.util.Scanner;

public class Tugas1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terjual, tottiket = 0;
        int tiket = 50000;
        double totalharga = 0, totsehari = 0;
        String namaPelanggan;
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'cukup' untuk Rekap): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("cukup")) {
                System.out.println("Terimakasih Untuk Hari Ini.");
                break;
            }

            System.out.print("Jumlah Pesan :");
            terjual = sc.nextInt();
            if (terjual < 0) {
                System.out.println("Tidak Valid.Masukkan Lagi Pesanan yang Valid");
                continue;
            }
            if (terjual > 10) {
                totalharga = (tiket * terjual) * 0.15;
                System.out.println("Anda mendapatkan diskon 15%");
            } else if (terjual > 4 && terjual < 10) {
                totalharga = (tiket * terjual) * 0.1;
                System.out.println("Anda mendapatkan diskon 10%");
            } else {
                totalharga = tiket * terjual;
            }
            System.out.println("Total bayar: Rp " + totalharga);
            totsehari += totalharga;
            tottiket += terjual;
            sc.nextLine();// untuk mengahapus newline
        } while (true);
        System.out.println("Total Tiket Terjual : " + tottiket);
        System.out.println("Total pendapatan hari ini: Rp " + totsehari);
        sc.close();
    }
}
