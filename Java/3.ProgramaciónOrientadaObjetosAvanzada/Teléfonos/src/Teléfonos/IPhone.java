package Teléfonos;

public class IPhone extends Phone implements Ringable{

	public IPhone(String numeroVersion, int porcentajeBateria, String operador, String ringTone) {
		super(numeroVersion, porcentajeBateria, operador, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		
		return "IPhone "+getNumeroVersion()+" dice "+getRingTone();
	}

	@Override
	public String unlock() {
		
		return "Desbloqueo via reconocimiento facial.";
	}

	@Override
	public void displayinfo() {
		System.out.println("IPhone "+ getNumeroVersion()+ " de "+getOperador());
		
	}

	

}
