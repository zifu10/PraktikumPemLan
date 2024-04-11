package TugasPemLan4;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("1. Manusia:");
        System.out.println("a. Laki-laki telah menikah:");
        Manusia lakiMenikah = new Manusia("John", "3224050305020004", true, true);
        System.out.println(lakiMenikah);

        System.out.println("\nb. Perempuan telah menikah:");
        Manusia perempuanMenikah = new Manusia("Jane", "3113455307030001", false, true);
        System.out.println(perempuanMenikah);

        System.out.println("\nc. Belum menikah:");
        Manusia belumMenikah = new Manusia("Alice", "2135533910010003", false, false);
        System.out.println(belumMenikah);

        System.out.println("\n2. MahasiswaFilkom:");
        System.out.println("a. IPK kurang dari 3:");
        MahasiswaFILKOM ipkKurang = new MahasiswaFILKOM("215150600111100", 2.7, "Budi", "2375051103030001", true, true);
        System.out.println(ipkKurang);

        System.out.println("\nb. IPK antara 3 dan 3.5:");
        MahasiswaFILKOM ipkSedang = new MahasiswaFILKOM("225150200111101", 3.2, "Citra", "3104124406040002", false, false);
        System.out.println(ipkSedang);

        System.out.println("\nc. IPK antara 3.5 dan 4:");
        MahasiswaFILKOM ipkBagus = new MahasiswaFILKOM("235150400111102", 3.8, "Zaid", "3184140501050001", true, false);
        System.out.println(ipkBagus);

        System.out.println("\n3. Pekerja:");
        System.out.println("a. Lama bekerja 2 tahun, anak 2:");
        Pekerja pekerjaBaru = new Pekerja(1000, 2022, 3, 2, 4, "Bagas", "3275040309920006", true, true);
        System.out.println(pekerjaBaru);

        System.out.println("\nb. Lama bekerja 9 tahun:");
        Pekerja pekerjaTengah = new Pekerja(2000, 2015, 3, 2, 0, "Fauzi", "3155050509970009", true, true);
        System.out.println(pekerjaTengah);

        System.out.println("\nc. Lama bekerja 20 tahun, anak 10:");
        Pekerja pekerjaLama = new Pekerja(3000, 2004, 3, 2, 10, "Gina", "2275433708980006", false, true);
        System.out.println(pekerjaLama);

        System.out.println("\n4. Manager:");
        Manager manager = new Manager("HRD", 7500, 2009, 3, 2, 10, "Hadi", "1594984703780001", true, true);
        System.out.println(manager);
    }
}
