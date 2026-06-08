package PBO07_24060124140139.UniversalInclusion.Seminar;

public class Seminar {
    private static final int MAX_PESERTA = 100;
    private static Civitasakademika[] pesertas = new Civitasakademika[MAX_PESERTA];
    private static int banyakPeserta = 0;

    public Seminar() {
        banyakPeserta = 0;
    }

    public static int countPeserta() {
        return banyakPeserta;
    }

    public static void registrasi(Civitasakademika peserta) {
        if (banyakPeserta < MAX_PESERTA) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    public static void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println("Nomor: " + pesertas[i].getNomor() + ", Nama: " + pesertas[i].getNama());
        }
    }

    public static int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}