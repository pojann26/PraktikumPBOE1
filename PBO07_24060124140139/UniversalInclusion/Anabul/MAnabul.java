package PBO07_24060124140139.UniversalInclusion;

public class MAnabul {
    public static void main(String[] args) {
        Anabul a;
        
        a = new Kucing();
        a.Gerak();  
        a.Bersuara();   

        a = new Anjing();
        a.Gerak(); 
        a.Bersuara(); 

        a = new Burung();
        a.Gerak(); 
        a.Bersuara(); 
    }
}