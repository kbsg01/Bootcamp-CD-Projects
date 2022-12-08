public class PersonaTest {

    public static void main(String[] args) {
        Persona p1 = new Persona(19, "Persona1");
        Persona p2 = new Persona(15, "Persona2");
        Persona p3 = new Persona(14, "Persona3");
        System.out.println(Persona.cuentaPersonas());
    }
}