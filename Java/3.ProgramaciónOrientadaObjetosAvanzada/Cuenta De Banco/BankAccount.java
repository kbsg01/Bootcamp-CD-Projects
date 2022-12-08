import java.util.Random;

public class BankAccount {
    // Atributos
    private String numCuenta = "";
    private Double saldoCtaCorriente = 0.0;
    private Double saldoCtaAhorros = 0.0;
    private static int cuentasCreadas = 0;
    private static Double dineroTotal= 0.0;

    // constructor
    public BankAccount(){
        String numCuenta = nuevoNumCuenta();
        Double saldoCtaCorriente = 0.0;
        Double saldoCtaAhorros = 0.0;
        cuentasCreadas +=1;
        System.out.println("Nuevo usuario creado con nuemero de cuenta: "+numCuenta+".");
        System.out.println("Total cuentas creadas: "+cuentasCreadas+".");
    }
    
    // Metodos
    private String nuevoNumCuenta(){
        String tablaNum = "0123456789";
        String numAleatorio = "";

        Random alt = new Random();

        for(int i = 0; i < 10; i++){
            char num = tablaNum.charAt(alt.nextInt(10));
            numAleatorio+= num;
        }
        numCuenta = numAleatorio;
        return numAleatorio;
    }

    public void depositoCuenta(String tipo, Double montoDeposito){
        if(tipo == "Corriente"){
            setSaldoCtaCorriente(getSaldoCtaCorriente() +montoDeposito);
            dineroTotal+=montoDeposito;
            System.out.println("Se han depositado $"+montoDeposito+" a la cuenta de tipo: "+ tipo);
        }
        if(tipo == "Ahorros"){
            setSaldoCtaAhorros(getSaldoCtaAhorros()+montoDeposito);
            dineroTotal += montoDeposito;
            System.out.println("Se han depositado $"+montoDeposito+" a la cuenta de tipo: "+ tipo);
        }
    }

    public void retiroCuenta(String tipo, Double retiroCuenta) {
        if(tipo == "Corriente"){
            if(getSaldoCtaCorriente() < retiroCuenta){
                System.out.println("Dinero insuficiente para el retiro.");
            }
            else{
                setSaldoCtaCorriente(getSaldoCtaCorriente()-retiroCuenta);
                dineroTotal -= retiroCuenta;
                System.out.println("Se han retirado $"+retiroCuenta+" de la cuenta tipo: "+tipo);
            }
        }
        if(tipo == "Ahorros"){
            if(getSaldoCtaAhorros() < retiroCuenta){
                System.out.println("Dinero insuficiente para el retiro.");
            }
            else{
                setSaldoCtaAhorros(getSaldoCtaAhorros()-retiroCuenta);
                dineroTotal -= retiroCuenta;
                System.out.println("Se han retirado $"+retiroCuenta+" de la cuenta tipo: "+tipo);
            }
        }
    }

    public Double miBalance(){
        Double dineroTotal = saldoCtaAhorros + saldoCtaCorriente;
        System.out.println("El balance total de las cuentas es de $"+dineroTotal);
        return dineroTotal;
    }


    // Getters y Setters
    public Double getSaldoCtaCorriente() {
        return saldoCtaCorriente;
    }

    public Double getSaldoCtaAhorros() {
        return saldoCtaAhorros;
    }

    public void setSaldoCtaCorriente(Double saldoCtaCorriente) {
        this.saldoCtaCorriente = saldoCtaCorriente;
    }

    public void setSaldoCtaAhorros(Double saldoCtaAhorros) {
        this.saldoCtaAhorros = saldoCtaAhorros;
    }
}