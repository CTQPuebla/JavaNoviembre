package com;

public class Autobuses extends Terminal {

	public Autobuses() {
		// TODO Auto-generated constructor stub
	}

	public String modelo;
	public String marca;
	public String placa;
	public int nAsientos;


	

	public Autobuses(String nombreT, String direccionT, String modelo, String marca, String placa, int nAsientos) {
		super(nombreT, direccionT);
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.nAsientos = nAsientos;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getnAsientos() {
		return nAsientos;
	}

	public void setnAsientos(int nAsientos) {
		this.nAsientos = nAsientos;
	}

	@Override
	public String toString() {
		return "Autobuse: "+modelo+"\nMarca: "+marca+"\nPlaca: "+placa+"\nNumero de asientos: "+nAsientos+"\nNombre de la terminal: "+
	nombreT+"\nDireccion: "+direccionT+"\n";
		
	}

	

}
