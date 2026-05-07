package PBO07_24060124140139.Overloading;

class Mahasiswa {
    public String NIM;
    public String Nama;
    public String ProgramStudi;

    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }
    
    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    public Mahasiswa(Mahasiswa mhs) {
        this.NIM = mhs.NIM;
        this.Nama = mhs.Nama;
        this.ProgramStudi = mhs.ProgramStudi;
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getProgramStudi() {
        return this.ProgramStudi;
    }

    public void setProgramStudi() {
        this.ProgramStudi = "";
    }

    public void setProgramStudi(String Prodi) {
        this.ProgramStudi = Prodi;
    }

    public void setProgramStudi(Mahasiswa Mhs) {
        this.ProgramStudi = Mhs.ProgramStudi;
    }   
}