package com;

import java.util.List;

public class Reservar {
	
	public Reservar() {
		// TODO Auto-generated constructor stub
	}
	

	List<Viajes> list;


	public Reservar(List<Viajes> list) {
		super();
		this.list = list;
	}


	public List<Viajes> getList() {
		return list;
	}


	public void setList(List<Viajes> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "Lista de destinos"+list+"\n";
	}
	
	

}
