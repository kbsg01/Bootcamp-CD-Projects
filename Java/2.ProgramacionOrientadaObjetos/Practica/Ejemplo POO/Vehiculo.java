public class Vehiculo {

    String marca;
    int modelo;
    int nroLlantas = 4;
    int nroPuertas = 4;
    String color;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public mostrarInfromacion() {
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Color: "+ color);
        System.out.println("Nro Puertas: "+ nroPuertas);
        System.out.println("Nro Llantas"+ nroLlantas);
    }
}
