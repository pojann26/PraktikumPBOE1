package PBO07_24060124140139.Overloading;

public class MMahasiswa {
    public static void main(String[] args) {

        System.out.println("=== Bagian B dan C ===");
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Sebelum diisi");
        System.out.println("NIM : " + m1.getNim());
        System.out.println("Nama : " + m1.getNama());
        System.out.println("Program Studi : " + m1.getProgramStudi());
        
        m1.setNim("6767676767");
        m1.setNama("M Fauzan AKbar");
        System.out.println("\nSetelah diisi");
        System.out.println("NIM : " + m1.getNim());
        System.out.println("Nama : " + m1.getNama());
        System.out.println("Program Studi (belum diisi): " + m1.getProgramStudi());

        System.out.println("\n=== Bagian D ===");
        Mahasiswa m2 = new Mahasiswa("987654321", "Prabs", "Teknik Pengajian");
        System.out.println("NIM : " + m2.getNim());
        System.out.println("Nama : " + m2.getNama());
        System.out.println("Program Studi : " + m2.getProgramStudi());

        System.out.println("\n=== Bagian E ===");
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("NIM : " + m3.getNim());
        System.out.println("Nama : " + m3.getNama());
        System.out.println("Program Studi : " + m3.getProgramStudi());

        System.out.println("\n=== Tes setProgramStudi ===");
        m1.setProgramStudi();
        System.out.println("Program Studi (tanpa parameter): " + m1.getProgramStudi());
        
        m1.setProgramStudi("Informatika");
        System.out.println("Program Studi (dengan parameter String): " + m1.getProgramStudi());

        m1.setProgramStudi(m2);
        System.out.println("Program Studi (dengan parameter Mahasiswa): " + m1.getProgramStudi());
    }
}