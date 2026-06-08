package PBO07_24060124140139.Overloading;

class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }
    
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa mhs) {
        this.nim = mhs.getNim();
        this.nama = mhs.getNama();
        this.programStudi = mhs.getProgramStudi();
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProgramStudi() {
        return this.programStudi;
    }

    public void setProgramStudi() {
        this.programStudi = "n/a";
    }

    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa mhs) {
        this.programStudi = mhs.getProgramStudi();
    }   
}