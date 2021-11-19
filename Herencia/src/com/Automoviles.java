package com;

public class Automoviles {

	String marca;
	Double caballosDeFuerza;
	int numeroDePlazas;
	int modelo;
	double precio;
	
	Automoviles () {
		
	}

	public Automoviles(String marca, Double caballosDeFuerza, int numeroDePlazas, int modelo, double precio) {
		super();
		this.marca = marca;
		this.caballosDeFuerza = caballosDeFuerza;
		this.numeroDePlazas = numeroDePlazas;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(Double caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public int getNumeroDePlazas() {
		return numeroDePlazas;
	}

	public void setNumeroDePlazas(int numeroDePlazas) {
		this.numeroDePlazas = numeroDePlazas;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Automoviles [marca=" + marca + ", caballosDeFuerza=" + caballosDeFuerza + ", numeroDePlazas="
				+ numeroDePlazas + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
	
}


