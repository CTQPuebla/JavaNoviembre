package com;

public class Cliente extends Persona {
	String rfc;
	public Cliente() {
		
	}
	public Cliente(String rfc) {
		
		this.rfc = rfc;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	@Override
	public String toString() {
		return "Cliente [rfc=" + rfc + ", FechaNac=" + FechaNac + ", Nombre=" + Nombre + ", peso=" + peso + "]";
	}
	
	

}
