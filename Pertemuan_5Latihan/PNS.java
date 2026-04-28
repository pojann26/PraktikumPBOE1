/*  Nama File   : PNS.java
    Deskripsi   : Class PNS extends Manusia implements Pajak
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_5Latihan;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * this.getPendapatan();
    }

    @Override
    public int hitungMasaKerja() {
        // A = 9 (digit ke-14 NIM: 24060124140139)
        int A = 9;
        int tahun = Period.between(this.getTgl_mulai_kerja(), LocalDate.now()).getYears();
        return tahun + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP        : " + this.nip);
        System.out.println("Masa Kerja : " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak      : Rp " + String.format("%,.0f", this.hitungPajak()));
    }
}