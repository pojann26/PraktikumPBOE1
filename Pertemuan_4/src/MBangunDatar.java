public class MBangunDatar {
    public static void main(String[] args) {
        // Persegi
        Persegi kotak = new Persegi(4, 5.0, "Hijau", "Solid");
        System.out.println("=== Objek Persegi ===");
        kotak.printInfo();
        System.out.println("Luas: " + kotak.getLuas());
        System.out.println("Keliling: " + kotak.getKeliling());
        System.out.println("Diagonal: " + kotak.getDiagonal());

        System.out.println();

        // Lingkaran
        Lingkaran bundar = new Lingkaran(14.0, "Putih", "Dot");
        System.out.println("=== Objek Lingkaran ===");
        bundar.printInfo();
        System.out.println("Jari-jari: " + bundar.getJari());
        System.out.println("Luas: " + bundar.getLuas());
        System.out.println("Keliling: " + bundar.getKeliling());
    }
}