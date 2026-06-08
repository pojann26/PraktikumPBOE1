package PBO07_24060124140139.UniversalInclusion;

public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}