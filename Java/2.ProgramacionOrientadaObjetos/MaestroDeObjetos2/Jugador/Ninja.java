package Jugador;
import Humano.Human;
public class Ninja extends Human{

    public Ninja(){
        this.setStealth(10);
    }    


    public void steal(Human human) {
        human.setHealth(human.getHealth()-getStealth());
        setHealth(getHealth()+getStealth());
        System.out.println("El ninja "+getName()+" ha robado "+getStealth()+"pts de salud a "+human.getName());
    }

    public void runAway(){
        setHealth(getHealth()-10);
        System.out.println("El ninja "+getName()+" a escapado, perdiendo "+ 10 + "pts de salud.");
    }

}
