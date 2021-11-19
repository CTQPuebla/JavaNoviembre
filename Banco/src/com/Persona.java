package com;

public class Persona extends Servivo {
	String FechaNac;
	
	public Persona() {
		
	}
	public String getFechaNac() {
		return FechaNac;
	}
	public void setFechaNac(String fechaNac) {
		FechaNac = fechaNac;
		
	}
	//al agregar el tostring agregamos inherit para agregar los atributos de la clase padre Servivo
	@Override
	public String toString() {
		return "Persona [FechaNac=" + FechaNac + ", Nombre=" + Nombre + ", peso=" + peso + "]";
	}
	

}
