package com;

public class Autobus {
	
	String modelo;
	String marca;
	String placas;
	int numAsientos;
	int max=40;
	
	public Autobus() {
		
	}

	public Autobus(String modelo, String marca, String placas, int numAsientos) {
		this.modelo = modelo;
		this.marca = marca;
		this.placas = placas;
		this.numAsientos = numAsientos;
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

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	
	

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "Autobus [modelo=" + modelo + ", marca=" + marca + ", placas=" + placas + ", numAsientos=" + numAsientos
				+ "]";
	}
	


}
