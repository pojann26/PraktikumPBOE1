package PBO08_24060124140139.Generik_ab;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Anabul> koleksi = new ArrayList<>();
    koleksi.add(new Kucing("Kitty", 2, "Betina", "Putih"));
    koleksi.add(new Anjing("Blacky", 3, "Jantan", "Cokelat"));
    koleksi.add(new Burung("Anton", 1, "Betina", "Kuning"));

    System.out.println("=== SIMULASI AWAL ===");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.info();
      a.gerak();
      a.bersuara();
      a.makan();
      a.tidur();
      if (a instanceof Kucing)
        ((Kucing) a).scratch();
      else if (a instanceof Anjing)
        ((Anjing) a).fetch();
      else if (a instanceof Burung)
        ((Burung) a).terbangTinggi();
      System.out.println();
    }

    System.out.println("=== SIMULASI PERUBAHAN DATA ===");
    koleksi.get(0).setNama("Kitty Missy");
    koleksi.get(0).setUmur(3);
    koleksi.get(1).setWarna("Hitam");
    koleksi.get(2).setJenisKelamin("Jantan");
    koleksi.get(2).setUmur(2);

    System.out.println("\n--- STATE SETELAH PERUBAHAN ---");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.info();
    }

    System.out.println("\n=== SIMULASI SETELAH PERUBAHAN ===");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.gerak();
      a.bersuara();
      a.makan();
      a.tidur();

      if (a instanceof Kucing)
        ((Kucing) a).scratch();
      else if (a instanceof Anjing)
        ((Anjing) a).fetch();
      else if (a instanceof Burung)
        ((Burung) a).terbangTinggi();
      System.out.println();
    }
  }
}