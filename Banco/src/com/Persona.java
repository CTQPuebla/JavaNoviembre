package com;

public class Persona extends SerVivo {

	 String fechaDeNacimiento;
	 
	 public Persona() {
		 
	 }

	public Persona(String fechaDeNacimiento) {
		
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}
	 
	 
}

   
    
    