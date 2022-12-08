public class Perro extends AnimalTerrestre{

    
    public Perro(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Soy un perro!!" + obtenerId());
    }
    @Override
    public void sonido() {
        super.sonido();
        System.out.println("Guau Guau Guau!!");
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
