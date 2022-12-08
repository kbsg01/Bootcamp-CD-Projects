package Jugador;
import Humano.Human;
public class Wizard extends Human{
    public Wizard(){
        this.setHealth(50);
        this.setIntelligence(8);
    }
    
    public void heal(Human human) {
        human.setHealth(human.getHealth()+getIntelligence());
        System.out.println(getName() +" ha aumentado la salud de "+human.getName()+" en "+getIntelligence()+" pts.");
    }

    public void fireBall(Human human){
        human.setHealth(human.getHealth()-getIntelligence()*3);
        System.out.println("Oh "+getName()+" ah lanzado una bola de fuego a "+human.getName()+" causando "+ getIntelligence()*3+ "pts. de daño!");
    }
}
