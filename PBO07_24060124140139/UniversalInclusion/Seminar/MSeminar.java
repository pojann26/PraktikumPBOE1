package PBO07_24060124140139.UniversalInclusion.Seminar;

public class MSeminar {
    public static void main(String[] args) {
        Seminar seminar = new Seminar();

        Dosen d1 = new Dosen("Dr. Smith", "12345");
        Dosen d2 = new Dosen("Prof. Johnson", "67890");

        Mahasiswa m1 = new Mahasiswa("Alice", "11111");
        Mahasiswa m2 = new Mahasiswa("Bob", "22222");
        Mahasiswa m3 = new Mahasiswa("Charlie", "33333");
        Mahasiswa m4 = new Mahasiswa("Diana", "44444");
        Mahasiswa m5 = new Mahasiswa("Eve", "55555");

        Seminar.registrasi(d1);
        Seminar.registrasi(d2);
        Seminar.registrasi(m1);
        Seminar.registrasi(m2);
        Seminar.registrasi(m3);
        Seminar.registrasi(m4);
        Seminar.registrasi(m5);

        System.out.println("Banyak peserta: " + Seminar.countPeserta());

        Seminar.tampilPeserta();

        System.out.println("Banyak mahasiswa: " + Seminar.countMahasiswa());

        m1.setWali(d1);
        m2.setWali(d2);
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}