package com.Banco.src.com.copy;

public class Persona extends SerVivo{
	
	String fechaNacimiento;

	public Persona() {
		
	}

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
