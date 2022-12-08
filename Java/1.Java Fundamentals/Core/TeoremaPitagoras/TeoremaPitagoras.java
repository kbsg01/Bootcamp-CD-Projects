public class TeoremaPitagoras {
    public static double calcularHipotenusa(int a, int b) {
        double hipotenuza = (a * a) + (b * b);
        double c = Math.sqrt(hipotenuza);
        return c;
    }
}

