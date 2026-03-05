import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;    

    public Mahasiswa(){
        this.NIM = "";
        this.Nama = "";
        this.Prodi = "";
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public Mahasiswa (String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public ArrayList<MataKuliah> getListMatKul() {
        return listMatkul;
    }

    public Dosen getDosen() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String newNim) {
        NIM = newNim;
    }

    public void setNama(String newNama) {
        Nama = newNama;
    }

    public void setProdi(String newProdi) {
        Prodi = newProdi;
    }

    public void setDosen(Dosen newDosen) {
        dosenWali = newDosen;
    }

    public void setKendaraan(Kendaraan newKendaraan) {
        kendaraan = newKendaraan;
    }
    
    public void addMatKul (MataKuliah newMatKul) {
        listMatkul.add(newMatKul);
    }

    public int getJumlahSKS(){
        int i;
        int count = 0;
        for(i=0; i<listMatkul.size();i++){
            count = count + listMatkul.get(i).getSks();
        }
        return count;
    }

    int getJumlahMatKul() {
        return listMatkul.size();
    }

    public void printDetailMhs(){
        System.out.println("NIM = " + NIM);
        System.out.println("Nama = " + Nama);
        System.out.println("Prodi = " + Prodi);
        System.out.println("List Mata Kuliah = ");
        int j;
        for(j = 0; j < listMatkul.size(); j++){
            System.out.println(listMatkul.get(j).getNamaMatKul());
        }
    }
}