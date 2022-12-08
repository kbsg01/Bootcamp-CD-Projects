public class Gato extends AnimalTerrestre{

    
    public Gato(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Soy un gato!!");
    }

    @Override
    public void sonido() {
        super.sonido();
        System.out.println("Miau Miauuu!");
    }
    
    @Override
    public void camina(int velocidad) {
        super.camina(velocidad);
    }

    @Override
    public void corriendo(int velocidad) {
        super.corriendo(velocidad);
    }
}
