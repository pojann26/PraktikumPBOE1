/*  Nama File   : BangunDatar.java
    Deskripsi   : Abstract class BangunDatar dengan method getLuas, getKeliling,
                  isEqualLuas, dan isEqualKeliling
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_5;

public abstract class BangunDatar {
    private int jmlSisi;
    protected String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar : " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return this.jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return this.border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi : " + this.jmlSisi);
        System.out.println("Warna       : " + this.warna);
        System.out.println("Border      : " + this.border);
    }

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    public abstract double getLuas();
    public abstract double getKeliling();
}