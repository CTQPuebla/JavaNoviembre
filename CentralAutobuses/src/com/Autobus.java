package com;

public class Autobus {
	private String modelo;
	private String marca;
	private String placas;
	private int numAsientos;
	private int asientosOcupados;
	private int folio;
	private boolean enUso;
	
	public Autobus() {
		this.asientosOcupados = numAsientos;
	}

	public Autobus(String modelo, String marca, String placas, int numAsientos, boolean enUso) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.placas = placas;
		this.numAsientos = numAsientos;
		this.asientosOcupados = 0;
		this.enUso = enUso;
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
	
	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public boolean isEnUso() {
		return enUso;
	}

	public void setEnUso(boolean enUso) {
		this.enUso = enUso;
	}

	@Override
	public String toString() {
		return "Autobus [modelo=" + modelo + ", marca=" + marca + ", placas=" + placas + ", numAsientos=" + numAsientos
				+ "]";
	}
	
	
}
