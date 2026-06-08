package PBO07_24060124140139.UniversalInclusion.Seminar;

public class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.dosenWali = null;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public String getNim() {
        return nim;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim + ", Nama: " + getNama() + ", Dosenwali: " + (dosenWali != null ? dosenWali.getNama() : "Tidak ada"));
    }
}