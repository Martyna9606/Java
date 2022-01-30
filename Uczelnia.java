package ZadDod3;

public class Uczelnia {
    String nazwa;
    int iloscStudentow;
    Sala[] listaSal;

    public Uczelnia(String nazwa, int iloscStudentow){
        this.listaSal = new Sala[0];
        this.nazwa = nazwa;
        this.iloscStudentow = iloscStudentow;
    }
}
