package TugasPemlan2;

public class Library {
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private String sinopsis;

    public Library(String judul, String penulis, int jumlahHalaman, String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        this.sinopsis = sinopsis;
    }

    public int hitungJumlahKataSinopsis() {
        String[] kataKata = sinopsis.split(" ");
        return kataKata.length;
    }

    public void output(){
        System.out.printf("1. %-15s: %s\n" + "2. %-15s: %s\n" + "3. %-15s: %s halaman\n" 
            + "4. %-15s: %s\n" + "5. %-15s: %s\n\n", "Judul Buku", judul, "Penulis", penulis, "Jumlah Halaman", jumlahHalaman, 
            "Sinopsis", sinopsis, "Jumlah Kata di Sinopsis", hitungJumlahKataSinopsis());
    }

    public void kategori(Library[] libraryArray){
        int i = 0;
        for (Library library : libraryArray) {
            i++;
            if (i <= libraryArray.length) 
                System.out.println("Buku yang ke-" + i);
            library.output();
        }
    }
}
