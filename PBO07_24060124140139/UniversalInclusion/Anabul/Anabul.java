package PBO07_24060124140139.UniversalInclusion;

public abstract class Anabul {
    private String Nama;

    public Anabul() {
        this.Nama = "";
    }

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}