package TugasPemLan4;

public class Pekerja extends Manusia {
    private double gaji;
    private int tahunMasuk;
    private int bulanMasuk;
    private int tanggalMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.bulanMasuk = bulanMasuk;
        this.tanggalMasuk = tanggalMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public double getBonus() {
        int lamaKerja = 2024 - tahunMasuk;
        if (lamaKerja <= 5)
            return 0.05 * gaji;
        else if (lamaKerja <= 10)
            return 0.10 * gaji;
        else
            return 0.15 * gaji;
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20.0);
    }

    public String toString() {
        return String.format("%s%n" +
                             "tahun masuk    : %d %d %d%n" +
                             "jumlah anak    : %d%n" +
                             "gaji           : %.1f%n",
                             super.toString(), tanggalMasuk, bulanMasuk, tahunMasuk, jumlahAnak, gaji);
    }
}