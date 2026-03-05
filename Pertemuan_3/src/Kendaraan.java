public class Kendaraan {
    private String noPlat;
    private String Jenis;

    public Kendaraan(){
        this.noPlat = "";
        this.Jenis = "";
    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    public String GetnoPlat(){
        return noPlat;
    }

    public String GetJenis(){
        return Jenis;
    }

    public void setnoPlat(String newnoPlat){
        noPlat = newnoPlat;
    }

    public void GetnoPlat(String newJenis){
        Jenis = newJenis;
    }
}
