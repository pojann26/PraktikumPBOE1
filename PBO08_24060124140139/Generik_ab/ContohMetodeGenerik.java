package PBO08_24060124140139.Generik_ab;

public class ContohMetodeGenerik {

  // a) Metode untuk menukar isi dua objek Datum<T>
  public static <T> void tukarIsi(Datum<T> d1, Datum<T> d2) {
    T temp = d1.getIsi();
    d1.setIsi(d2.getIsi());
    d2.setIsi(temp);
  }

  // b) Metode generik untuk mensimulasikan perilaku Anabul di dalam Datum<T>
  public static <T extends Anabul> void simulasikan(Datum<T> datum) {
    T a = datum.getIsi();
    System.out.println("=== Simulasi generik: " + a.getNama() + " ===");
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
}