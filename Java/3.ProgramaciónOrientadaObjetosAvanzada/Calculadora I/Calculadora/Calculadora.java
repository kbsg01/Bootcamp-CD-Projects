package Calculadora;

public class Calculadora {
    // Atributos
    private Double operador1 = 0.0;
    private Double operador2 = 0.0;
    private Double resultado = 0.0;
    private String operacion = "";

    // Constructor
    public Calculadora(){}

    public Calculadora(Double operador1, String operacion, Double operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.operacion = operacion;
    }

    // Metodos

    public void perfomOperation(){
        if(getOperacion().equals("+")){
            Double total = getOperador1() + getOperador2();
            setResultado(total);
        }
        else if(getOperacion().equals("-")){
            Double total = getOperador1() - getOperador2();
            setResultado(total);
        }
    }

    public void getResult() {
        System.out.println(getResultado());
    }


    // Getters y Setters
    public Double getOperador1() {
        return operador1;
    }
    public Double getOperador2() {
        return operador2;
    }
    public Double getResultado() {
        return resultado;
    }
    public String getOperacion() {
        return operacion;
    }

    public void setOperador1(Double operador1) {
        this.operador1 = operador1;
    }
    public void setOperador2(Double operador2) {
        this.operador2 = operador2;
    }
    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}