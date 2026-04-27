package Pertemuan_5;

public class MBangunDatar {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");

        BangunDatar L1 = new Lingkaran(14, "Hijau", "Kuning"); // r=7
        Lingkaran L2 = new Lingkaran(28, "Ungu", "Hitam");     // r=14

        System.out.println("=== Info P1 ===");
        P1.printInfo();

        System.out.println("\n=== Info P2 ===");
        P2.printInfo();

        System.out.println("\n=== Info L1 ===");
        L1.printInfo();

        System.out.println("\n=== Info L2 ===");
        L2.printInfo();

        // Perbandingan
        System.out.println("\n=== Perbandingan ===");
        System.out.println("P1 luas sama dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("P1 keliling sama dengan L1? " + P1.isEqualKeliling(L1));
        System.out.println("P1 luas sama dengan L1? " + P1.isEqualLuas(L1));

        // Counter
        System.out.println();
        BangunDatar.printCounterBangunDatar();

        // IResize
        System.out.println("\n=== zoomIn P2 ===");
        P2.zoomIn();
        System.out.println("Sisi: " + P2.getSisi());

        System.out.println("\n=== zoomOut L2 ===");
        L2.zoomOut();
        System.out.println("Jari-jari: " + L2.getJariJari());

        System.out.println("\n=== zoom(150) P2 ===");
        P2.zoom(150);
        System.out.println("Sisi: " + P2.getSisi());
    }
}