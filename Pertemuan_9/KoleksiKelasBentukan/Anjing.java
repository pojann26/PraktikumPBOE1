package Pertemuan_9.KoleksiKelasBentukan;

public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String Panggilan) {
        super(Panggilan);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Berlari");
    }

    @Override
    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}