/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Muhammad Fauzan Akbar
 * Tanggal      : 04 Maret 2026
 */

public class Garis {
    /**********ATRIBUT**********/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /**********METHOD**********/

    // 2a. Konstruktor tanpa parameter: titik awal (0,0), titik akhir (1,1)
    Garis() {
        titikAwal  = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // 2b. Konstruktor dgn parameter titik awal dan titik akhir
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal  = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // 2c. Selektor dan Mutator

    // mengembalikan titik awal garis
    Titik getTitikAwal() {
        return titikAwal;
    }

    // mengembalikan titik akhir garis
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    // mengembalikan jumlah objek garis yang pernah dibuat
    static int getCounterGaris() {
        return counterGaris;
    }

    // mengeset titik awal garis
    void setTitikAwal(Titik t) {
        titikAwal = t;
    }

    // mengeset titik akhir garis
    void setTitikAkhir(Titik t) {
        titikAkhir = t;
    }

    // 2d. mengembalikan panjang garis
    double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // 2e. mengembalikan gradien garis
    double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // 2f. mengembalikan titik tengah dari sebuah garis
    Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2,
                         (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
    }

    // 2g. mengecek apakah garis ini sejajar dengan garis G
    boolean isSejajarDengan(Garis G) {
        if (this.getGradien() == G.getGradien())
            return true;
        else
            return false;
    }

    // 2h. mengecek apakah garis ini tegak lurus dengan garis G
    boolean isTegakLurusDengan(Garis G) {
        if (this.getGradien() * G.getGradien() == -1)
            return true;
        else
            return false;
    }

    // 2i. mencetak titik awal dan titik akhir garis ke layar
    void printGaris() {
        System.out.println("Titik Awal  : (" + titikAwal.getAbsis()  + "," + titikAwal.getOrdinat()  + ")");
        System.out.println("Titik Akhir : (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    // 2j. mencetak persamaan garis lurus sebuah garis
    void PersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.printf("y = %.1fx + %.1f%n", m, c);
    }
}