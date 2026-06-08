package Pertemuan_9.KoleksiKelasBentukan;

public class Kucing extends Anabul {
    private double Bobot;

    public Kucing() {
        super();
        this.Bobot = 0.0;
    }

    public Kucing(String Panggilan, double Bobot) {
        super(Panggilan);
        this.Bobot = Bobot;
    }

    public double getBobot() {
        return this.Bobot;
    }

    public void setBobot(double Bobot) {
        this.Bobot = Bobot;
    }
    
    @Override
    public void Gerak() {
        System.out.println("Berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
}