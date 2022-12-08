public class Persona {
    private int edad;
    private String nombre;
    private static int numeroDePersonas = 0;
    
    public Persona(int edadParam, String nombreParam) {
        edad = edadParam;
        nombre = nombreParam;
        numeroDePersonas++;
    }

    public static int cuentaPersonas() {
        return numeroDePersonas;
    }

    // gettersAndStters
    public int getEdad() {   //no se puede llamar a un metodo/get/set que no es estatico(static) dentro de un metodo statico
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}