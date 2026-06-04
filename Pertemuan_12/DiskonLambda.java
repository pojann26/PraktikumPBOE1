package Pertemuan_12;

// File: DiskonLambda.java
// Deskripsi: Ekspresi lambda dasar, digunakan untuk menghitung diskon.

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // 1. Tanpa lambda (Menggunakan Anonymous Inner Class)
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        // 2. Dengan lambda (Satu baris ekspresi, tanpa return keyword)
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // 3. Dengan lambda dengan blok statement (Menggunakan kurung kurawal & return)
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}