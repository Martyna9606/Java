package ZadDod3;

public class Student {
    private static int count;
    String imie;
    String nazwisko;
    int id;

    public Student(String imie, String nazwisko){
        this.count = count + 1;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = count;
    }

}
