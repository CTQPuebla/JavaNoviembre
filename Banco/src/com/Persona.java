package com;

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
	        return "Persona{ " +"nombre= "+nombre +" peso= "+peso  + 
	        		" fechaNacimiento= " + fechaNacimiento + '}';
	    }

	   

	   

}
