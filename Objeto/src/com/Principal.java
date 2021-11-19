package com;

public class Principal {

	public static void main (String [] args) {
		
	Vivienda v= new Vivienda();
	v.setMetros2(420);
	v.setTipoDeUsoDeSuelo("A2");
	v.setNoDeHabitaciones(4);
	v.setNoDeBaños(3.5);
	v.setNombreDelVendedor("Alberto Jimenez");
	
	System.out.println(v);
	}
}
