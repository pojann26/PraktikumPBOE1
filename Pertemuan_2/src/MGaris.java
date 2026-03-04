/* Nama File    : MGaris.java
 * Deskripsi    : berisi main class untuk menguji class Garis
 * Pembuat      : Muhammad Fauzan Akbar
 * Tanggal      : 04 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {

        // Uji konstruktor tanpa parameter
        Garis g1 = new Garis();
        System.out.println("g1 (default):");
        g1.printGaris();

        // Uji konstruktor dengan parameter
        Titik A = new Titik(0, 0);
        Titik B = new Titik(4, 3);
        Garis g2 = new Garis(A, B);
        System.out.println("g2:");
        g2.printGaris();

        // Uji setter
        System.out.println("===Setter===");
        g2.setTitikAwal(new Titik(1, 1));
        System.out.println("g2 setelah setTitikAwal(1,1):");
        g2.printGaris();

        // Uji panjang garis
        System.out.println("===Panjang Garis===");
        Garis g3 = new Garis(new Titik(0, 0), new Titik(3, 4));
        System.out.println("Panjang g3 = " + g3.getPanjang());

        // Uji gradien
        System.out.println("===Gradien===");
        Garis g4 = new Garis(new Titik(0, 0), new Titik(2, 4));
        System.out.println("Gradien g4 = " + g4.getGradien());

        // Uji titik tengah
        System.out.println("===Titik Tengah===");
        Titik tengah = g3.getTitikTengah();
        System.out.println("Titik tengah g3 = (" + tengah.getAbsis() + "," + tengah.getOrdinat() + ")");

        // Uji sejajar
        System.out.println("===Sejajar===");
        Garis gA = new Garis(new Titik(0, 0), new Titik(2, 2)); // gradien 1
        Garis gB = new Garis(new Titik(1, 3), new Titik(3, 5)); // gradien 1
        Garis gC = new Garis(new Titik(0, 0), new Titik(2, 4)); // gradien 2
        System.out.println("gA sejajar gB? " + gA.isSejajarDengan(gB));
        System.out.println("gA sejajar gC? " + gA.isSejajarDengan(gC));

        // Uji tegak lurus
        System.out.println("===Tegak Lurus===");
        Garis gD = new Garis(new Titik(0, 0), new Titik(1,  2));
        Garis gE = new Garis(new Titik(0, 0), new Titik(2, -1));
        Garis gF = new Garis(new Titik(0, 0), new Titik(1,  1));
        System.out.println("gD tegak lurus gE? " + gD.isTegakLurusDengan(gE));
        System.out.println("gD tegak lurus gF? " + gD.isTegakLurusDengan(gF));

        // Uji counterGaris
        System.out.println("===Counter Garis===");
        System.out.println("Jumlah objek Garis yang dibuat: " + Garis.getCounterGaris());

        // Uji Persamaan Garis
        System.out.println("===Persamaan Garis===");
        Garis gP = new Garis(new Titik(-2, 0), new Titik(0, 4));
        gP.PersamaanGaris();
    }
}