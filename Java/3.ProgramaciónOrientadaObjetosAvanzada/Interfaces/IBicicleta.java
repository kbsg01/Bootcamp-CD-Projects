public interface IBicicleta {

    double miConstante = 3.0;

    default void diHola(){
        System.out.println("Hola a todes.");
    }

    static void staticMethod(){
        System.out.println("Hola desde el metodo static de la interfaz");
    }

    void acelerar(int incrementa);
    void frenar(int disminuir);
}
