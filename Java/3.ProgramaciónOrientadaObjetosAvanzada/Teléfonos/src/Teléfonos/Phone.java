package Teléfonos;

public abstract class Phone {
	private String numeroVersion;
	private int porcentajeBateria;
	private  String operador;
	private String ringTone;
	
	public Phone(String numeroVersion, int porcentajeBateria, String operador, String ringTone) {
		this.setNumeroVersion(numeroVersion);
		this.setPorcentajeBateria(porcentajeBateria);
		this.setOperador(operador);
		this.setRingTone(ringTone);
	}

	public abstract void displayinfo();
		
	
//	Getters y Setters
	public String getNumeroVersion() {
		return numeroVersion;
	}

	public void setNumeroVersion(String numeroVersion) {
		this.numeroVersion = numeroVersion;
	}

	public int getPorcentajeBateria() {
		return porcentajeBateria;
	}

	public void setPorcentajeBateria(int porcentajeBateria) {
		this.porcentajeBateria = porcentajeBateria;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
}
