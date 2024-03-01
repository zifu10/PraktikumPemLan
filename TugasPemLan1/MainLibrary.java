package TugasPemLan1;
import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library add = new Library();
        
        while (true) {
            System.out.printf("=======[Perpustakaan]=======\n"
                + "Masukkan pilihan untuk melihat buku berdasarkan kategori\n"
                + "1. Teknologi\n" + "2. Filsafat\n" + "3. Sejarah\n" + "4. Agama\n"
                + "5. Psikologi\n" + "6. Politik\n" + "7. Fiksi\n"
                + "8. Tampilkan total buku yang tersedia\n" + "9. Keluar dari program\n");
            System.out.println("Silahkan memasukkan kode yang diinginkan(1-9)");

            int code = scan.nextInt();
            if (code == 1) {
                add.showtype(add.Teknologi, "Teknologi");
            } else if (code == 2) {
                add.showtype(add.Filsafat, "Filsafat");
            } else if (code == 3) {
                add.showtype(add.Sejarah, "Sejarah");
            } else if (code == 4) {
                add.showtype(add.Agama, "Agama");
            } else if (code == 5) {
                add.showtype(add.Psikologi, "Psikologi");
            } else if (code == 6) {
                add.showtype(add.Politik, "Politik");
            } else if (code == 7) {
                add.showtype(add.Fiksi, "Fiksi");
            } else if (code == 8) {
                System.out.println();
                System.out.println("Terdapat 35 total buku yang ada di Perpustakaan ini");
                System.out.println();
            } else if (code == 9) {
                break;
            } else {
                System.out.println();
                System.out.println("Mohon untuk menginput angka yang sudah ditawarkan");
                System.out.println();
            }
        }
        scan.close();
    }

}
