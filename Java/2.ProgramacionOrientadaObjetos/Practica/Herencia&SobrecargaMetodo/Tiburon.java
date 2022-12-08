public class Tiburon extends AnimalAcuatico{

    public Tiburon(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override // gracias a la herencia de Animal, se sobreescribe el metodo sin necesidad de copiar y pegar
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Soy un tiburon!!");
    }

    @Override
    public void nadar(int velocidad) {
        super.nadar(velocidad);
    }
}
