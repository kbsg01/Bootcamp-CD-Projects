public class BicicletaTest {
    public static void main(String[] args) {
        Bicicleta b = new Bicicleta();

        System.out.println(Bicicleta.miConstante);
        b.diHola();
        b.staticMethod();
        b.acelerar(3);
        b.frenar(2);
        System.out.println(b.getVelocidad());
    }
}
