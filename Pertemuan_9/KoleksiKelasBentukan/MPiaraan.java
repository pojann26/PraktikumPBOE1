package Pertemuan_9.KoleksiKelasBentukan;

public class MPiaraan {
    public static void main(String[] args) {
        // kamus
        Piaraan antrian;
        Anjing a1;
        Kucing k1;
        Anggora k2;
        KembangTelon k3;
        Burung b1;

        // algoritma
        antrian = new Piaraan();
        a1 = new Anjing("Snowie");
        k1 = new Kucing("Timtam", 5.0);
        k2 = new Anggora("Kenken", 7.5);
        k3 = new KembangTelon("Embul", 7.0);
        b1 = new Burung("Scarlet Macaw");

        System.out.println("=== Tambahkan ke antrian ===");
        antrian.enqueueAnabul(a1);
        antrian.enqueueAnabul(k1);
        antrian.enqueueAnabul(k2);
        antrian.enqueueAnabul(k3);
        antrian.enqueueAnabul(b1);
        antrian.showAnabul();
        System.out.println("\nJumlah elemen dalam antrian: " + antrian.getNbelm());

        System.out.println("\n=== Cek isMember ===");
        System.out.println("Apakah Embul dalam antrian: " + antrian.isMember(k3));

        System.out.println("\n=== Ambil anabul dan cek anabul dalam antrian pertama ===");
        System.out.println("Antrian pertama: " + antrian.getAnabul().getNama() + "\n");
        System.out.print("Ambil: " + antrian.dequeueAnabul().getNama() + ", " + antrian.dequeueAnabul().getNama());
        System.out.println("\n");
        antrian.showAnabul();
        System.out.println("\nApkaah Timtam masih berada dalam antrian: " + antrian.isMember(k1));
        System.out.println("Jumlah elemen dalam antrian: " + antrian.getNbelm());

        System.out.println("\n=== Menghitung banyaknya keluarga kucing dan bobotnya ====");
        System.out.println("Banyak kucing dalam antrian: " + antrian.countKucing());
        System.out.println("Totol bobot kucing dalam antrian: " + antrian.bobotKucing());

        System.out.println("\n=== Menampilkan antrian berserta jenisnya ===");
        antrian.showJenisAnabul();
    }
}