package com;

public class Vivienda {

	double metros2;
	String tipoDeUsoDeSuelo;
	int noDeHabitaciones;
	double noDeBaņos;
	String nombreDelVendedor;
	

    public Vivienda() {
 
    	
}


	public Vivienda(double metros2, String tipoDeUsoDeSuelo, int noDeHabitaciones, double noDeBaņos,
			String nombreDelVendedor) {
		this.metros2 = metros2;
		this.tipoDeUsoDeSuelo = tipoDeUsoDeSuelo;
		this.noDeHabitaciones = noDeHabitaciones;
		this.noDeBaņos = noDeBaņos;
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


	public double getNoDeBaņos() {
		return noDeBaņos;
	}


	public void setNoDeBaņos(double noDeBaņos) {
		this.noDeBaņos = noDeBaņos;
	}


	public String getNombreDelVendedor() {
		return nombreDelVendedor;
	}


	public void setNombreDelVendedor(String nombreDelVendedor) {
		this.nombreDelVendedor = nombreDelVendedor;
	}


 
	
	
	
}