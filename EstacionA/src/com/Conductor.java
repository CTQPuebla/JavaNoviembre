package com;

public class Conductor extends Autobuses {
	public Conductor() {
		// TODO Auto-generated constructor stub
	}

	public String ine;
	public String nombre;
	public String edad;

	
	public Conductor(String nombreT, String direccionT, String modelo, String marca, String placa, int nAsientos,
			String ine, String nombre, String edad) {
		super(nombreT, direccionT, modelo, marca, placa, nAsientos);
		this.ine = ine;
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getIne() {
		return ine;
	}


	public void setIne(String ine) {
		this.ine = ine;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Ine: "+ine+"\nNombre:  "+
	nombre+"\nEdad:  "+edad+"\nModelo:  "+
				modelo+"\nMarca: "+marca+
				"\nPlaca: "+placa+"\nNumero de Asientos"+nAsientos+"\nNombre C: "+nombreT+"\nDireccion "+direccionT+"\n";
	}

}
