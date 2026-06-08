package Pertemuan_9.KoleksiKelasBentukan;

public abstract class Anabul {
    private String Panggilan;

    public Anabul() {
        this.Panggilan = "";
    }

    public Anabul(String Panggilan) {
        this.Panggilan = Panggilan;
    }

    public String getNama() {
        return this.Panggilan;
    }

    public void setNama(String Panggilan) {
        this.Panggilan = Panggilan;
    }
    
    // abstact method
    public abstract void Gerak();
    public abstract void Bersuara();
}