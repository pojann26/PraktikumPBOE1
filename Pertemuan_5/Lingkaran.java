/*  Nama File   : Lingkaran.java
    Deskripsi   : Class Lingkaran yang extends BangunDatar dan implements IResize
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_5;

public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;

    public Lingkaran() {
        super(1, "", "");
        this.jariJari = 0;
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jariJari = diameter / 2;
    }

    public double getJariJari() {
        return this.jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return Math.PI * this.jariJari * this.jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * this.jariJari;
    }

    @Override
    public void zoomIn() {
        this.jariJari = this.jariJari * 1.1;
    }

    @Override
    public void zoomOut() {
        this.jariJari = this.jariJari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.jariJari = this.jariJari * (percent / 100.0);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari   : " + this.jariJari);
        System.out.println("Luas        : " + this.getLuas());
        System.out.println("Keliling    : " + this.getKeliling());
    }
}