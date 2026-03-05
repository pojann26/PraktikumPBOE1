public class MataKuliah {
    private String idMatKul;
    private String Nama;
    private Integer sks;

    public MataKuliah(){
        idMatKul = "";
        Nama = "";
        sks = 0;
    }

    MataKuliah(String newIdMatKul, String newNamaMatKul, int newSks) { 
        idMatKul = newIdMatKul;
        Nama = newNamaMatKul;
        sks = newSks;
    }

    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNamaMatKul() {
        return Nama;
    }

    public int getSks() {
        return sks;
    }

    public void setIdMatKul(String newIdMatKul) {
        idMatKul = newIdMatKul;
    }

    public void setNamaMatKul(String newNamaMatKul) {
        Nama = newNamaMatKul;
    }

    public void setSks(int newSks) {
        sks = newSks;
    }
}
