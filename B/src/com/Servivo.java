package com;

public class Servivo {

	String nombre;
	String peso;
	
	
	public Servivo() {
		
	}


	public Servivo(String nombre, String peso) {
		
		this.nombre = nombre;
		this.peso = peso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Servivo [nombre=" + nombre + ", peso=" + peso + "]";
	}
	
	
}
