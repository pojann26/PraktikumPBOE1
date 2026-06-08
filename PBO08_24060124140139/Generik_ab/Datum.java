package PBO08_24060124140139.Generik_ab;

public class Datum<T> {
  // Atribut
  private T isi;

  // Konstruktor
  public Datum(T isi) {
    this.isi = isi;
  }

  // Selektor (getter)
  public T getIsi() {
    return isi;
  }

  // Mutator (setter)
  public void setIsi(T isi) {
    this.isi = isi;
  }
}