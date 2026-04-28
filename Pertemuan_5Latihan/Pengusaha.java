/*  Nama File   : Pengusaha.java
    Deskripsi   : Class Pengusaha extends Manusia implements Pajak
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_5Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return this.npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * this.getPendapatan();
    }

    @Override
    public int hitungMasaKerja() {
        // B = 3 (digit ke-13 NIM: 24060124140139)
        int B = 3;
        int tahun = Period.between(this.getTgl_mulai_kerja(), LocalDate.now()).getYears();
        return tahun + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP       : " + this.npwp);
        System.out.println("Masa Kerja : " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak      : Rp " + String.format("%,.0f", this.hitungPajak()));
    }
}