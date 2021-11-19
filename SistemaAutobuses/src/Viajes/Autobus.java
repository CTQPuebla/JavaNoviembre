package Viajes;

public class Autobus {
	
	String clase;
	String marca;
	String placa;
	int numAsientos;
	int max=40;
	
	public Autobus() {
		super();
	}

	public Autobus(String clase, String marca, String placa, int numAsientos) {
		super();
		this.clase = clase;
		this.marca = marca;
		this.placa = placa;
		this.numAsientos = numAsientos;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	
	
	public int getmax() {
		return max;
	}
	

	@Override
	public String toString() {
		return "Autobus [clase=" + clase + ", marca=" + marca + ", placa=" + placa + ", numAsientos=" + numAsientos
				+ "]";
	}
	
	
	
	

}
