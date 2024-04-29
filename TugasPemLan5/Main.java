package TugasPemLan5;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = generateKueArray();

        for (Kue kue : kueArray) {
            System.out.println(kue.toString());
        }

        double totalHargaSemuaKue = hitungTotalHarga(kueArray);

        double[] totalHargaDanBeratKuePesanan = hitungTotalHargaDanBeratKuePesanan(kueArray);

        double[] totalHargaDanJumlahKueJadi = hitungTotalHargaDanJumlahKueJadi(kueArray);

        Kue kueTerbesar = cariKueDenganHargaTertinggi(kueArray);

        System.out.println("==============[S T A T S]==============");
        System.out.println("TOTAL HARGA SEMUA KUE        : Rp" + String.format("%,.2f", totalHargaSemuaKue));
        System.out.println();
        System.out.println("TOTAL HARGA KUE PESANAN      : Rp" + String.format("%,.2f", totalHargaDanBeratKuePesanan[0]));
        System.out.println("TOTAL BERAT KUE PESANAN      : " + String.format("%.1f", totalHargaDanBeratKuePesanan[1]) + " gram");
        System.out.println();
        System.out.println("TOTAL HARGA KUE JADI         : Rp" + String.format("%,.2f", totalHargaDanJumlahKueJadi[0]));
        System.out.println("TOTAL JUMLAH KUE JADI        : " + String.format("%.1f", totalHargaDanJumlahKueJadi[1]) + " buah");
        System.out.println();
        System.out.println("KUE DENGAN HARGA TERTINGGI");
        System.out.println("     Berdasarkan Jenis          : " + (kueTerbesar instanceof KuePesanan ? "Kue Pesanan" : "Kue Jadi"));
        System.out.println("     Berdasarkan Nama Kue       : " + kueTerbesar.nama);
    }

    public static Kue[] generateKueArray() {
        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Bika Ambon", 8000.0, 20.0);
        kueArray[1] = new KuePesanan("Lapis Legit", 10000.0, 25.0);
        kueArray[2] = new KueJadi("Martabak Manis", 2500.0, 5.0);
        kueArray[3] = new KueJadi("Dadar Gulung", 2000.0, 3.0);
        kueArray[4] = new KuePesanan("Kue Lumpur", 5000.0, 15.0);
        kueArray[5] = new KuePesanan("Brownies", 12000.0, 30.0);
        kueArray[6] = new KueJadi("Pukis", 1500.0, 6.0);
        kueArray[7] = new KueJadi("Kue Cubit", 1000.0, 20.0);
        kueArray[8] = new KuePesanan("Kue Talam", 4000.0, 18.0);
        kueArray[9] = new KuePesanan("Kue Mangkok", 6000.0, 22.0);
        kueArray[10] = new KueJadi("Kue Putu", 3000.0, 7.0);
        kueArray[11] = new KueJadi("Kue Klepon", 3500.0, 9.0);
        kueArray[12] = new KuePesanan("Kue Lumpur", 7000.0, 17.0);
        kueArray[13] = new KuePesanan("Kue Bingka", 9000.0, 28.0);
        kueArray[14] = new KueJadi("Kue Lumpur", 4500.0, 11.0);
        kueArray[15] = new KueJadi("Kue Leker", 2000.0, 12.0);
        kueArray[16] = new KuePesanan("Kue Bolu", 11000.0, 32.0);
        kueArray[17] = new KuePesanan("Kue Mangkok", 6500.0, 23.0);
        kueArray[18] = new KueJadi("Kue Pancong", 4000.0, 14.0);
        kueArray[19] = new KueJadi("Kue Pukis", 2500.0, 15.0);

        return kueArray;
    }

    public static double hitungTotalHarga(Kue[] kueArray) {
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        return totalHarga;
    }

    public static double[] hitungTotalHargaDanBeratKuePesanan(Kue[] kueArray) {
        double totalHarga = 0;
        double totalBerat = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHarga += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).berat;
            }
        }
        return new double[]{totalHarga, totalBerat};
    }

    public static double[] hitungTotalHargaDanJumlahKueJadi(Kue[] kueArray) {
        double totalHarga = 0;
        double totalJumlah = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHarga += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).jumlah;
            }
        }
        return new double[]{totalHarga, totalJumlah};
    }

    public static Kue cariKueDenganHargaTertinggi(Kue[] kueArray) {
        Kue kueTerbesar = kueArray[0];
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > kueTerbesar.hitungHarga()) {
                kueTerbesar = kue;
            }
        }
        return kueTerbesar;
    }
}