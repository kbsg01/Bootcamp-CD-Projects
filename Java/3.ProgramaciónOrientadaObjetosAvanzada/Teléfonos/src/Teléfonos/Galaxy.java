package Teléfonos;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String numeroVersion, int porcentajeBateria, String operador, String ringTone) {
		super(numeroVersion, porcentajeBateria, operador, ringTone);
		
	}

	@Override
	public String ring() {
		return "Galaxy "+getNumeroVersion()+" dice "+getRingTone();
	}

	@Override
	public String unlock() {
		
		return "Desbloqueo via huella digital";
	}

	@Override
	public void displayinfo() {
		System.out.println("Galaxy "+getNumeroVersion()+" de "+getOperador());
		
	}
	
	

}
