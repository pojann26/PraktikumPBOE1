package PBO07_24060124140139.UniversalInclusion;

public class Kucing extends Anabul {
    public Kucing() {
        super();
    }

    public Kucing(String nama) {
        super(nama);
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