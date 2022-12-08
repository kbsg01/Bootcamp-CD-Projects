public class AnimalAcuatico extends Animal{

    public AnimalAcuatico(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }
    public void nadar(int velocidad){
        System.out.println(nombre + " Esta nadando a " + velocidad + " kms hora\n");
        }
}
