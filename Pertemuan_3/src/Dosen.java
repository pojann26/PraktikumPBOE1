public class Dosen {
    //===== ATRIBUT =====//
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIP() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNIP(String newNip) {
        nip = newNip;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setProdi(String newProdi) {
        prodi = newProdi;
    }
}