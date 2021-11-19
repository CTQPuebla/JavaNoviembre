package com;

import java.util.List;

public class Banco {
	String OficinaCentral;
	String Nombre;
	String Nacionalidad;
	
	List<Cuenta> list;
	
	public Banco(String oficinaCentral, String nombre, String nacionalidad, List<Cuenta> list) {
	
		OficinaCentral = oficinaCentral;
		Nombre = nombre;
		Nacionalidad = nacionalidad;
		this.list = list;
	}
	public List<Cuenta> getList() {
		return list;
	}
	public void setList(List<Cuenta> list) {
		this.list = list;
	}
	public Banco()
	{
		
	}
	public String getOficinaCentral() {
		return OficinaCentral;
	}
	public void setOficinaCentral(String oficinaCentral) {
		OficinaCentral = oficinaCentral;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return "Banco [OficinaCentral=" + OficinaCentral + ", Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad
				+ ", list=" + list + "]";
	}

	
}
