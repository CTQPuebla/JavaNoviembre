package com;

public class Origen extends Persona {
	String LugarNac;
	String EstadoNac;
	public Origen() {
		
	}
	public String getLugarNac() {
		return LugarNac;
	}
	public void setLugarNac(String lugarNac) {
		LugarNac = lugarNac;
	}
	public String getEstadoNac() {
		return EstadoNac;
	}
	public void setEstadoNac(String estadoNac) {
		EstadoNac = estadoNac;
	}
	@Override
	public String toString() {
		return "Origen [LugarNac=" + LugarNac + ", EstadoNac=" + EstadoNac + ", FechaNac=" + FechaNac + ", Nombre="
				+ Nombre + ", peso=" + peso + "]";
	}
	
	

}
