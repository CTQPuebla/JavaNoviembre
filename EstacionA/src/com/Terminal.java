package com;

public class Terminal {

	public Terminal() {
		// TODO Auto-generated constructor stub
	}

	 String nombreT;
	 String direccionT;

	
	public Terminal(String nombreT, String direccionT) {
		super();
		this.nombreT = nombreT;
		this.direccionT = direccionT;
	}


	public String getNombreT() {
		return nombreT;
	}


	public void setNombreT(String nombreT) {
		this.nombreT = nombreT;
	}


	public String getDireccionT() {
		return direccionT;
	}


	public void setDireccionT(String direccionT) {
		this.direccionT = direccionT;
	}


	@Override
	public String toString() {
		return  "Nombre terminal: "+nombreT+"\nDireccion Termina: "+direccionT;
	}

}
