// practicando herencia
public class Animal {
    private int id;

    String nombre;
    int edad;
    String color;
    float alto;
    float largo;
    float peso;
    String raza;

    // a este proceso se le llama sobregarga de metodo 
    public Animal(int id, String nombre, int edad, String color, float alto, float largo, float peso, String raza){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
        this.raza = raza;

    }

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal(int id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarInfo() {
        System.out.println("Hola soy "+ nombre + " y tengo " + edad + " años");
        if(color != null && color.isEmpty() == false){
            System.out.println("Mi color es " + color);
        }
    }

    public void sonido() {
        System.out.println("Mi sonido es ");
    }

    public int obtenerId(){
        return id;
    }

}
