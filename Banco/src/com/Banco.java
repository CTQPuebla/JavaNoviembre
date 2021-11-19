package com;

import java.util.List;

public class Banco {
	String nombre;
	String oficinaCentral;
	String nacionalidad;
	List<Cuenta> list;
	
	public Banco () {
		
	}

	public Banco(String nombre, String oficinaCentral, String nacionalidad, List<Cuenta> list) {
		super();
		this.nombre = nombre;
		this.oficinaCentral = oficinaCentral;
		this.nacionalidad = nacionalidad;
		this.list = list;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOficinaCentral() {
		return oficinaCentral;
	}

	public void setOficinaCentral(String oficinaCentral) {
		this.oficinaCentral = oficinaCentral;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<Cuenta> getList() {
		return list;
	}

	public void setList(List<Cuenta> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", oficinaCentral=" + oficinaCentral + ", nacionalidad=" + nacionalidad
				+ ", list=" + list + "]";
	}

	
}
