public class Gorila extends Mammal{
    
    public void throwSomething(){
        System.out.println("Oh! El gorila ha arrojado algo...");
        this.setEnergyLevel(this.getEnergyLevel() - 5);
    }

    public void eatBannanas(){
        System.out.println("Al gorila le gustan estas bananas!");
        this.setEnergyLevel(this.getEnergyLevel() + 10);
    }

    public void climb() {
        System.out.println("El gorila ha trepado a la cima de un arbol!");
        this.setEnergyLevel(this.getEnergyLevel()-10);
    }
}
