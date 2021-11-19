package com;

import java.util.List;

public class Linea {
	String nombre;
	List<Bus> list;

	public Linea() {
		
	}

	public Linea(String nombre, List<Bus> list) {
		super();
		this.nombre = nombre;
		this.list = list;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Bus> getList() {
		return list;
	}

	public void setList(List<Bus> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Linea [nombre=" + nombre + ", list=" + list + "]";
	}
	
}
