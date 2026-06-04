package Pertemuan_12;

// File: MapLambdaList.java
// Deskripsi: Implementasi lambda untuk menampilkan key dan value dari Map (NIM dan Nama)

import java.util.HashMap;
import java.util.Map;

public class MapLambdaList {
    public static void main(String[] args) {
        // Membuat objek Map dengan NIM (String) sebagai Key dan Nama (String) sebagai Value
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        // Menambahkan data mahasiswa (NIM, Nama)
        mahasiswaMap.put("24060122120001", "Adi");
        mahasiswaMap.put("24060122130002", "Bambang");
        mahasiswaMap.put("24060122140003", "Cici");
        mahasiswaMap.put("24060122140004", "Didi");

        System.out.println("--- Daftar Mahasiswa (NIM dan Nama) ---");
        
        // Menggunakan ekspresi lambda sebagai parameter pada method forEach
        // (nim, nama) bertindak sebagai parameter lambda untuk (key, value)
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}