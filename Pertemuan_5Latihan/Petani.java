/*  Nama File   : Petani.java
    Deskripsi   : Class Petani extends Manusia implements Pajak
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_5Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota() {
        return this.asal_kota;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak kena pajak
    }

    @Override
    public int hitungMasaKerja() {
        // C = 1 (digit ke-12 NIM: 24060124140139)
        int C = 1;
        int tahun = Period.between(this.getTgl_mulai_kerja(), LocalDate.now()).getYears();
        return tahun + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota  : " + this.asal_kota);
        System.out.println("Masa Kerja : " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak      : Rp " + String.format("%,.0f", this.hitungPajak()));
    }
}