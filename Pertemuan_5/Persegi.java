/*  Nama File   : Persegi.java
    Deskripsi   : Class Persegi yang extends BangunDatar dan implements IResize
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_5;

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        super(4, "", "");
        this.sisi = 0;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public void setPersegi(double sisi, String warna, String border){
        this.sisi = sisi;
        this.setWarna(warna);
        this.setBorder(border);
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return this.sisi * this.sisi;
    }

    public double getKeliling() {
        return 4 * this.sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.sisi = this.sisi * percent / 100.0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + this.sisi);
        System.out.println("Luas        : " + this.getLuas());
        System.out.println("Keliling    : " + this.getKeliling());
    }
}