import java.util.Scanner;

public class SiakadFor17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidak = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidak++;
            }
        }
        System.out.println("Nilai Teritinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Siswa yang lulus :" + lulus);
        System.out.println("Siswa Yang tidak lulus :" + tidak);
        sc.close();
    }
}
