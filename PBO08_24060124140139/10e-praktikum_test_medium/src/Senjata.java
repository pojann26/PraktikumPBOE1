/* Nama File : Senjata.java
   Deskripsi : Kelas yang merepresentasikan senjata
   Pembuat : Muhammad Fauzan Akbar - 24060124140139
   Tanggal : 05 Mei 2026
*/

public class Senjata {
  private String bunyi;
  private boolean menusuk;
  private int peluru;

  public Senjata(String bunyi) {
    this.bunyi = bunyi;
    this.menusuk = false;
    this.peluru = 0;
  }

  public String getBunyi() {
    return bunyi;
  }

  public int getPeluru() {
    return peluru;
  }

  public boolean isMenusuk() {
    return menusuk;
  }

  public void setBunyi(String bunyi) {
    this.bunyi = bunyi;
  }

  public void setMenusuk(boolean menusuk) {
    this.menusuk = menusuk;
  }

  public void setPeluru(int peluru) {
    this.peluru = peluru;
  }
}