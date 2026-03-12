public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(int jmlSisi, double sisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.sisi = sisi;
        this.warna = warna;
        this.border = border;

    }

    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return 4 * this.sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
}