package Pertemuan_9.KoleksiKelasBentukan;

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    private Queue<Anabul> Lanabul;
    private int nbelm;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul firstElm = Lanabul.poll();
        if (firstElm != null) {
            nbelm--;
        }
        return firstElm;
    }

    public void showAnabul() {
        System.out.println("Daftar Anabul dalam Antrean:");
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama());
        }
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Jenis Anabul dalam Antrean:");
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Anggora) {
                System.out.println(anabul.getNama() + " adalah Anggora");
            } else if (anabul instanceof KembangTelon) {
                System.out.println(anabul.getNama() + " adalah Kembang Telon");
            } else if (anabul instanceof Kucing) {
                System.out.println(anabul.getNama() + " adalah Kucing");
            } else if (anabul instanceof Anjing) {
                System.out.println(anabul.getNama() + " adalah Anjing");
            } else if (anabul instanceof Burung) {
                System.out.println(anabul.getNama() + " adalah Burung");
            } else {
                System.out.println(anabul.getNama() + " adalah Anabul Misterius");
            }
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double bobot = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                bobot += ((Kucing) anabul).getBobot();
            }
        }
        return bobot;
    }
}