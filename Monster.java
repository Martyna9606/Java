package ZadDod3;
import java.util.Random;
import java.util.Scanner;

public class Monster {
    //Zad.1
    int health;
    String name;
    int strenght;
    int wygrane = 0;

    //Zad.2
    public Monster(String name, int health, int strenght){
        this.health = health;
        this.name = name;
        this.strenght = strenght;
    }

    public Monster(){
        this.health = 100;
        this.strenght = 100;
        this.name = "Potwor";
    }

    //Zad.3
    public void getHealth(){
        System.out.println(this.health);
    }
    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void getPower(){
        System.out.println(this.strenght);
    }

    public boolean isAlive(){
        return this.health>0?true:false;
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.strenght);
        System.out.println(this.health);

    }



}
