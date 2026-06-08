package Pertemuan_9.KoleksiKelasBentukan;

public class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String Panggilan) {
        super(Panggilan);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("Cuit");
    }
}