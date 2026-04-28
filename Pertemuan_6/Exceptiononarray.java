/*  Nama File   : ExceptionOnArray.java
    Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
    Pembuat     : Muhammad Fauzan Akbar
    Tanggal     : 27 - 04 - 2026
*/
package Pertemuan_6;

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}