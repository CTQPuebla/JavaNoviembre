package com;

public class Terminal {
        
	String direccion;
	int nPuerta;
	
	public Terminal() {
		
	}

	public Terminal(String direccion, int nPuerta) {
		super();
		this.direccion = direccion;
		this.nPuerta = nPuerta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getnPuerta() {
		return nPuerta;
	}

	public void setnPuerta(int nPuerta) {
		this.nPuerta = nPuerta;
	}

	@Override
	public String toString() {
		return "Terminal [direccion=" + direccion + ", nPuerta=" + nPuerta + "]";
	}
	
}
