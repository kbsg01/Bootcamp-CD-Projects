class Bicicleta implements IBicicleta {

    private int velocidad;
    public Bicicleta(){
        velocidad = 0;
    }

    public static void  staticMethod(){
        IBicicleta.staticMethod();
    }

    @Override
    public void acelerar(int incrementa) {
        velocidad += incrementa;
        
    }

    @Override
    public void frenar(int disminuir) {
        velocidad -= disminuir;
        
    }

    public int getVelocidad(){
        return velocidad;
    }
}