package com;

public class Vivienda {

	double metros2;
	String tipoDeUsoDeSuelo;
	int noDeHabitaciones;
	double noDeBa�os;
	String nombreDelVendedor;
	

    public Vivienda() {
 
    	
}


	public Vivienda(double metros2, String tipoDeUsoDeSuelo, int noDeHabitaciones, double noDeBa�os,
			String nombreDelVendedor) {
		this.metros2 = metros2;
		this.tipoDeUsoDeSuelo = tipoDeUsoDeSuelo;
		this.noDeHabitaciones = noDeHabitaciones;
		this.noDeBa�os = noDeBa�os;
		this.nombreDelVendedor = nombreDelVendedor;
	}


	public double getMetros2() {
		return metros2;
	}


	public void setMetros2(double metros2) {
		this.metros2 = metros2;
	}


	public String getTipoDeUsoDeSuelo() {
		return tipoDeUsoDeSuelo;
	}


	public void setTipoDeUsoDeSuelo(String tipoDeUsoDeSuelo) {
		this.tipoDeUsoDeSuelo = tipoDeUsoDeSuelo;
	}


	public int getNoDeHabitaciones() {
		return noDeHabitaciones;
	}


	public void setNoDeHabitaciones(int noDeHabitaciones) {
		this.noDeHabitaciones = noDeHabitaciones;
	}


	public double getNoDeBa�os() {
		return noDeBa�os;
	}


	public void setNoDeBa�os(double noDeBa�os) {
		this.noDeBa�os = noDeBa�os;
	}


	public String getNombreDelVendedor() {
		return nombreDelVendedor;
	}


	public void setNombreDelVendedor(String nombreDelVendedor) {
		this.nombreDelVendedor = nombreDelVendedor;
	}


 
	
	
	
}