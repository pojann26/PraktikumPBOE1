package PBO08_24060124140139.Generik_ab;

public class Kucing extends Anabul {

  public Kucing(String nama, int umur, String jenisKelamin, String warna) {
    super(nama, umur, jenisKelamin, warna);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan berjalan.");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: meong!!!");
  }

  public void scratch() {
    System.out.println(nama + " sedang mencakar.");
  }
}