
public class Autobus {
	String modelo;
	String marca;
	String placas;
	int numAsiento;
	int max = 40;
	
	public Autobus(){
		
	}

	public Autobus(String modelo, String marca, String placas, int numAsiento) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.placas = placas;
		this.numAsiento = numAsiento;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	
    //Getter de max
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "Autobus [modelo=" + modelo + ", marca=" + marca + ", placas=" + placas + ", numAsiento=" + numAsiento
				+ "]";
	}

}
