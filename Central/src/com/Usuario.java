package com;

public class Usuario {
	
	String nombre;
	String fechaNac;
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String fechaNac) {
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
		return "Usuario [nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
	}

}
