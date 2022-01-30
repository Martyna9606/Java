package ZadDod3;

public class Sala {
    int numer;
    int pojemnosc;
    public static Student[] studenci;

    public Sala(int numer, int pojemnosc){
        this.numer = numer;
        this.pojemnosc = pojemnosc;
        studenci = new Student[0];
    }

}
