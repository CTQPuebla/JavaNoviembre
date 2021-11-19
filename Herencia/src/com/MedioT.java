package com;

public class MedioT extends TipoDeTransporte{
	
	String combustible;
	
	public MedioT () {
		
	}

	public MedioT(String combustible) {
		super();
		this.combustible = combustible;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "MedioT [combustible=" + combustible + ", nombre=" + nombre + ", medio=" + medio + ", responsable="
				+ responsable + "]";
	}
	


}
