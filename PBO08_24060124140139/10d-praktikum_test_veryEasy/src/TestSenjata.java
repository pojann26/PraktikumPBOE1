/* Nama File : TestSenjata.java
   Deskripsi : Kelas yang menguji kelas Senjata
   Pembuat : Muhammad Fauzan Akbar - 24060124140139
   Tanggal : 04 Mei 2026
*/

public class TestSenjata {
  public static void main(String[] args) {
    Senjata ak47 = new Senjata("TAR");
    Senjata m16 = new Senjata("DOR");

    System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
    System.out.println("AK47 mengisi peluru");
    ak47.setPeluru(5);
    System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());

    System.out.println("AK47 menembak");
    ak47.menembak();
  }
}