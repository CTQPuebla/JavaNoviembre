package com;

public class Persona extends Servivo {
	
	public Persona() {
		
	}

	String fechaNacimiento;

	public Persona(String fechaNacimiento) {
		
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", peso=" + peso + "]";
	}
	
	
}
