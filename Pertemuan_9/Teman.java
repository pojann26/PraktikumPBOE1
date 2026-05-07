package Pertemuan_9;

import java.util.ArrayList;

public class Teman {
    private ArrayList<String> Lnama;
    private int nbelm;

    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm(){
        return nbelm;
    }   

    public String getNama(int indeks){
        if (indeks >= 0 && indeks < nbelm){
            return Lnama.get(indeks);
        }
        else{
            return null;
        }
    }
    public void setNama(int indeks, String nama){
        if (indeks >= 0 && indeks < nbelm){
            Lnama.set(indeks,nama);
        }
    }

    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama){
        Lnama.remove(nama;);
        nbelm--;
    }

    public void boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru){
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1){
            Lnama.set(indeks, namaBaru)
        }
    }

    public void countNama(String nama){
        int count = 0;
        for(string n : Lnama){
            if(n.equal(nama)){
                count++;
            }
        }
        return count;
    }

    public void showTeman(){
        for (string nama : Lnama){
            System.out.println(nama);
        }
    }
}
