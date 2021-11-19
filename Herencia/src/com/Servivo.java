package com;

public class Servivo {
	String Nombre;
	String peso;
	
	public Servivo()
	{
		
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Servivo [Nombre=" + Nombre + ", peso=" + peso + "]";
	}
	
}
