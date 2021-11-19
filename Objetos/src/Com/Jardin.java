package Com;

public class Jardin {
	float rosas;
	float tulipanes;
	float pasto;
	float fuente;
	float azador;
	
	public Jardin () {
		
	}

	public Jardin(float rosas, float tulipanes, float pasto, float fuente, float azador) {
		super();
		this.rosas = rosas;
		this.tulipanes = tulipanes;
		this.pasto = pasto;
		this.fuente = fuente;
		this.azador = azador;
	}

	public float getRosas() {
		return rosas;
	}

	public void setRosas(float rosas) {
		this.rosas = rosas;
	}

	public float getTulipanes() {
		return tulipanes;
	}

	public void setTulipanes(float tulipanes) {
		this.tulipanes = tulipanes;
	}

	public float getPasto() {
		return pasto;
	}

	public void setPasto(float pasto) {
		this.pasto = pasto;
	}

	public float getFuente() {
		return fuente;
	}

	public void setFuente(float fuente) {
		this.fuente = fuente;
	}

	public float getAzador() {
		return azador;
	}

	public void setAzador(float azador) {
		this.azador = azador;
	}

	@Override
	public String toString() {
		return "Jardin [rosas=" + rosas + ", tulipanes=" + tulipanes + ", pasto=" + pasto + ", fuente=" + fuente
				+ ", azador=" + azador + "]";
	}
	

}
