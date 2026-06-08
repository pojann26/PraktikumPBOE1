package Pertemuan_9.KoleksiKelasDasar;

public class MTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("Andi");
        teman.addNama("Susanto");
        teman.addNama("Andika");
        teman.addNama("Sinta");
        teman.addNama("Susanti");

        System.out.println("=== Daftar Teman ===");
        teman.showTeman();
        System.out.println("Jumlah Teman: " + teman.getNbelm());

        System.out.println("\nApakah andi teman? " + teman.isMember("Andi"));
        System.out.println("Jumlah nama Andi = " + teman.countNama("Andi"));

        System.out.println("\n=== Ubah index ke-1 === ");
        teman.setNama(1, "Dhimas");
        teman.showTeman();

        System.out.println("\n=== Ganti Andi menjadi Budi ===");
        teman.gantiNama("Andi", "Budi");
        teman.showTeman();

        System.out.println("\n=== Hapus Susanti ===");
        teman.delNama("Susanti");
        teman.showTeman();
        System.out.println("Jumlah teman sekarang: " + teman.getNbelm());
    }
}