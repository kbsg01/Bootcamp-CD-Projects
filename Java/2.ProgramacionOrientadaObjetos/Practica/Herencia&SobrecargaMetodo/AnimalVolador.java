public class AnimalVolador extends Animal {

    public AnimalVolador(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }
    public void volar(int velocidad){
    System.out.println(nombre + " Esta volando " + velocidad + " kms hora\n");
    }
}
