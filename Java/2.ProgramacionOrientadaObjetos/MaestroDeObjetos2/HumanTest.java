import Humano.Human;
import Jugador.*;

public class HumanTest {
    public static void main(String[] args) {
    Human hm = new Human("Sam");
    Ninja nj = new Ninja();
    nj.setName("Garu");
    Wizard wz = new Wizard();
    wz.setName("luke");
    Samurai sm = new Samurai();
    sm.setName("Wu Li");

    
    wz.fireBall(nj);
    nj.steal(hm);
    sm.deathBlow(hm);
    hm.showHealt();
    sm.showHealt();
    sm.meditate();
    sm.showHealt();
    sm.howMany();
    }
}
