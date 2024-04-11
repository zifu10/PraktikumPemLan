package TugasPemLan4;

class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, bulanMasuk, tanggalMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * getGaji());
    }

    public String toString() {
        return String.format("%s" +
                             "departemen     : %s%n",
                             super.toString(), departemen);
    }
}