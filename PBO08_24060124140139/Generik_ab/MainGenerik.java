package PBO08_24060124140139.Generik_ab;

public class MainGenerik {
  public static void main(String[] args) {
    // Buat Datum untuk tiap jenis Anabul
    Datum<Anabul> dk = new Datum<>(new Kucing("Kitty", 2, "Betina", "Putih"));
    Datum<Anabul> da = new Datum<>(new Anjing("Doggy", 3, "Jantan", "Cokelat"));
    Datum<Anabul> db = new Datum<>(new Burung("Tweety", 1, "Betina", "Kuning"));

    // Simulasi masing‑masing dengan metode generik
    ContohMetodeGenerik.simulasikan(dk);
    ContohMetodeGenerik.simulasikan(da);
    ContohMetodeGenerik.simulasikan(db);

    // Demonstrasi penukaran isi
    System.out.println("Sebelum tukar: " + dk.getIsi().getNama() + " & " + da.getIsi().getNama());
    ContohMetodeGenerik.tukarIsi(dk, da);
    System.out.println("Sesudah tukar: " + dk.getIsi().getNama() + " & " + da.getIsi().getNama());
  }
}