package com;

public class TipoDeTransporte {
	
	String nombre;
	String medio;
	String responsable;
	
	public TipoDeTransporte () {
		
		
	}

	public TipoDeTransporte(String nombre, String medio, String responsable) {

		this.nombre = nombre;
		this.medio = medio;
		this.responsable = responsable;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "TipoDeTransporte [nombre=" + nombre + ", medio=" + medio + ", responsable=" + responsable + "]";
	}


}
