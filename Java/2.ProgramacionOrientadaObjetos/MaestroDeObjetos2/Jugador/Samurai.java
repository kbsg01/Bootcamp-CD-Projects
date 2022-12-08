package Jugador;
import Humano.Human;
public class Samurai extends Human{
    
    static int samuraiCuenta = 0;
    public Samurai(){
        setHealth(200);
        samuraiCuenta +=1;
    }

    public void deathBlow(Human human){
        human.setHealth(human.getHealth()-human.getHealth());
        setHealth(getHealth()/2);
        System.out.println("BOOM! "+getName() + " ha destrozado a "+human.getName()+"!");
    }

    public void meditate(){
        setHealth(getHealth()+ getHealth()/2);
        System.out.println(getName()+" ha meditado, regenerando "+ getHealth()/2 + "pts de salud!");
    }

    public int howMany(){
        System.out.println("El numero actual del samuarai es: "+samuraiCuenta);
        return samuraiCuenta;
    }
}
