public class AnimalTerrestre extends Animal{

    public AnimalTerrestre(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }
    
    public void camina(int velocidad){
        System.out.println(nombre + " esta camiando a " + velocidad + " kms hora\n");
        }
    
    public void corriendo(int velocidad){
        System.out.println(nombre + " esta corriendo a " + velocidad + " kms hora\n");
        }
}
