package com;

public class Pasajero {
	String nombre;
	String fechaNac;;
	
	public Pasajero() {
		
	}

	public Pasajero(String nombre, String fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
	}

	

}
