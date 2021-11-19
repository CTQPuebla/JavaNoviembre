package com;

public class NombreLineaCamiones {
       
	
	   String nombre;
       String nacionalidad;
       
       public NombreLineaCamiones() {
    	   
       }

	public NombreLineaCamiones(String nombre, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "NombreLineaCamiones [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
       
       
}
