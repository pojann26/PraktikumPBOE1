/*  Nama File   : AngkaSialException.java
    Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_6;

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}