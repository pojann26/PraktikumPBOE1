/*  Nama File   : Asersi2.java
    Deskripsi   : Program untuk demo asersi, yang akan menolak input
                  jari-jari lingkaran yang bernilai nol
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_6;

import Pertemuan_5.Lingkaran;

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari, "", "");
        double kelilingLingkaran = l.getKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}