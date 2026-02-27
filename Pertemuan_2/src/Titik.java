/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Muhammad Fauzan Akbar
 * Tanggal      : 27 Februari 2026
 */

import java.security.PublicKey;

public class Titik {
    /*******************ATRIBUT*******************/
    private double absis;
    private double ordinat;
    private  static int counterTitik = 0;

    /*******************METHOD********************/
    //konstruktor untuk membuat titik (0,0)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }
    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
} //end class Titik