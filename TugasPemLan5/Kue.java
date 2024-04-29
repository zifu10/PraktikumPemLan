package TugasPemLan5;

public abstract class Kue {
    String nama;
    double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    abstract double hitungHarga();

    @Override
    public String toString() {
        System.out.println("Nama         : " + this.nama);
        System.out.println("Harga Satuan : Rp" + String.format("%,.2f", this.harga));
        double totalHarga = this.hitungHarga();
    
        if (this instanceof KuePesanan) {
            System.out.println("Berat        : " + String.format("%.1f", ((KuePesanan) this).berat) + " gram");
        } else if (this instanceof KueJadi) {
            System.out.println("Jumlah       : " + String.format("%.1f", ((KueJadi) this).jumlah));
        }
    
        System.out.println("Total Harga  : Rp" + String.format("%,.2f", totalHarga));
        System.out.println("Jenis Kue    : " + this.getClass().getSimpleName() + "\n");
    
        return ""; 
    }
}