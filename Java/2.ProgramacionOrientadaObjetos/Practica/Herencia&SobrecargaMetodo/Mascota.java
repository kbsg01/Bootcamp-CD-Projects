public class Mascota {
    
    public static void main(String[] args) {
        Perro lily = new Perro(20, "Lily", 4);
        lily.color = "blanco";
        lily.mostrarInfo();
        lily.sonido();
        lily.corriendo(10);

        Gato mika = new Gato(15, "Mika", 5);    
        mika.mostrarInfo();
        mika.sonido();
        mika.camina(3);

        Ave zazu = new Ave(2, "Zazu", 14);
        zazu.mostrarInfo();
        zazu.volar(5);

        Tiburon blanquito = new Tiburon(3, "Blanquito", 20);
        blanquito.mostrarInfo();
        blanquito.nadar(15);
    }
}
