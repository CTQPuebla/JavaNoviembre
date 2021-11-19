package com;

public class Bus {

	String placas;
	String modelos;
	String marcaBus;
	int numAsientos;
	int max =40;
	
	public Bus () {
		
	}

	public Bus(String placas, String modelos, String marcaBus, int numAsientos) {
		super();
		this.placas = placas;
		this.modelos = modelos;
		this.marcaBus = marcaBus;
		this.numAsientos = numAsientos;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getModelos() {
		return modelos;
	}

	public void setModelos(String modelos) {
		this.modelos = modelos;
	}

	public String getMarcaBus() {
		return marcaBus;
	}

	public void setMarcaBus(String marcaBus) {
		this.marcaBus = marcaBus;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	
		//getter del max
	public int getMax() {
		return max;
	}


	@Override
	public String toString() {
		return "Bus [placas=" + placas + ", modelos=" + modelos + ", marcaBus=" + marcaBus + ", numAsientos="
				+ numAsientos + "]";
	}

	
}
