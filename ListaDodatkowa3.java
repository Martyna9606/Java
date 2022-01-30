package ZadDod3;

import java.util.Random;

public class ListaDodatkowa3 {
    public static void main(String[] args){
        Monster[] potwory = new Monster[12];
        losujPotwory(potwory);
        for(int i = 0; i< potwory.length-1; i++) {
            for(int j = i + 1; j< potwory.length; j++) {
                Monster gracz1 = potwory[i];
                Monster gracz2 = potwory[j];
                Monster wygrany = arena(gracz1, gracz2);
                if (wygrany.name == potwory[i].name){potwory[i].wygrane++ ;}
                else {potwory[j].wygrane++;}
            }
        }

        for(Monster val:potwory){
            System.out.println(val.wygrane);
        }

        System.out.println("zad.7");
        Uczelnia uczelnia  = new Uczelnia("Politechnika", 50);
        Sala sala = new Sala(1, 25);
        dodajSale(sala, uczelnia);
        System.out.println(uczelnia.listaSal[0].pojemnosc);
        Student s1 = new Student("Jan", "Kowalski");
        Student s2 = new Student("Tomasz", "Kwiatkowski");
        Student s3 = new Student("Tomasz", "Kwiatkowski");

        System.out.println(s1.id);
        System.out.println(s2.id);
        System.out.println(s3.id);
        System.out.println(uczelnia.listaSal.length);
        System.out.println(Sala.studenci.length);
        dodajStudenta(s1, uczelnia);
        dodajStudenta(s2, uczelnia);
        System.out.println(Sala.studenci.length);


    }

    public static void losujPotwory(Monster[] potwory){
        String[] names = {"Henryk", "Bożygniew", "Demon"};
        int i = 0;
        while(i < potwory.length) {
            String name = names[(int) (Math.random() * names.length)] + (String.valueOf(i+1));
            int health = (int) (Math.random() * 100);
            int strength = (int) (Math.random() * 20);
            potwory[i] = new Monster(name, health, strength);
            i++;
        }
    }

    public static Monster arena(Monster potwor1, Monster potwor2){
        potwor1.takeDamage(potwor2.strenght);
        potwor2.takeDamage(potwor1.strenght);
        if(potwor1.isAlive()&& potwor2.isAlive()) {
            return arena(potwor1, potwor2);
        }
        else{
            return potwor1.health> potwor2.health ? potwor1 : potwor2;
        }

    }

    public static void dodajSale(Sala sala, Uczelnia uczelnia){
        Sala[] listaSal1 = new Sala[uczelnia.listaSal.length+1];
        for(int i = 0; i< uczelnia.listaSal.length; i++){
            listaSal1[i] = uczelnia.listaSal[i];
        }
        listaSal1[listaSal1.length-1] = sala;
        uczelnia.listaSal = listaSal1;
        listaSal1 = null;

    }

    public static void dodajStudenta(Student student, Uczelnia uczelnia){
        int i =0;
        while(i < uczelnia.listaSal.length){
            Sala sala  = uczelnia.listaSal[i];
            if (sala.pojemnosc >=  Sala.studenci.length){
                Student[] studenci1 = new Student[Sala.studenci.length+1];
                studenci1[studenci1.length-1] = student;
                for(int j = 0; j< Sala.studenci.length; j++){
                    studenci1[j] = Sala.studenci[j];
                }
                Sala.studenci = studenci1;
                studenci1 = null;
                sala = null;
                i = uczelnia.listaSal.length+1;
            }
            sala = null;
            i++;
        }
    }

}
