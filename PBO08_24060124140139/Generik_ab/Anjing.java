package PBO08_24060124140139.Generik_ab;

public class Anjing extends Anabul {

  public Anjing(String nama, int umur, String jenisKelamin, String warna) {
    super(nama, umur, jenisKelamin, warna);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan berlari.");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: guk-guk!!!");
  }

  public void fetch() {
    System.out.println(nama + " mengambil bola.");
  }
}