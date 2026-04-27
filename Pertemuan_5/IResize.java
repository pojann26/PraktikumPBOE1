/*  Nama File   : IResize.java
    Deskripsi   : Interface IResize untuk kemampuan resize objek bangun datar
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_5;

public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}