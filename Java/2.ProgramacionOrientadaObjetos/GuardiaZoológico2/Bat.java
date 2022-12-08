public class Bat extends Mammal{

    public Bat() {
        this.setEnergyLevel(300);
    }

    public void fly(){
        System.out.println("Oh no! El mega murcielago a extendido sus alas, está volando!");
        this.setEnergyLevel(getEnergyLevel()-50);
    }
    
    public void eatHumans(){
        System.out.println("Oh se comio un humano... Bueno no importa");
        this.setEnergyLevel(getEnergyLevel()+25);
    }

    public void attackTown(){
        System.out.println("El mega muercielago está atacando la ciudad, todos corran y busquen refugio!");
        this.setEnergyLevel(getEnergyLevel()-100);
    }
}
