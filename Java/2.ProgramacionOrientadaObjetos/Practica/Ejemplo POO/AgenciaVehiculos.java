import java.util.ArrayList;

/**
 * AgenciaVehiculos
 */
public class AgenciaVehiculos {

    public static void main(String[] args) {
        ArrayList<Vehiculo>vehiculos = new ArrayList<>();

        Vehiculo porche = new Vehiculo("Porche", 2010, "Negro");

        Vehiculo ford = new Vehiculo("Ford", 2017, "Rojo");

    vehiculos.add(porche);
    vehiculos.add(ford);

        
        listaCarros (vehiculos);
        System.out.println("Total inventario devehiculos: "+vehiculos.size());
    }

    public static void listaCarros(ArrayList<Vehiculo>vehiculos){
        for(Vehiculo carro :vehiculos){
            vehiculo.mostrarInfromacion());
        }
    }
}