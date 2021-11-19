package com;

public class Destinos {
	
	String ciudad;
	String terminal;
	
	public Destinos() {
		
	}

	public Destinos(String ciudad, String terminal) {
		super();
		this.ciudad = ciudad;
		this.terminal = terminal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	@Override
	public String toString() {
		return "Destinos [ciudad=" + ciudad + ", terminal=" + terminal + "]";
	}
    
	
}
