package com;

public class Modelo {

	//Atributos
	//Metodo constructor
	//Getter & Setters
	//Metodos propios (comportamiento) (se ve reflejado el comportamiento del objeto) pregunta de Softek
	
	//Atributos dependen de los valores que se haran llegar al modelo
	String atributo1;
	int atributo2;
	double atributo3;
	
	//Lugar donde se indica como se construira el objeto 
	
	public Modelo() {
		
	}
	
	public Modelo(String atributo1, int atributo2, double atributo3) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}
	
	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public int getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}

	public double getAtributo3() {
		return atributo3;
	}

	public void setAtributo3(double atributo3) {
		this.atributo3 = atributo3;
	}

	// Estado de un objeto 
	@Override
	public String toString() {
		return "Modelo [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
	}
	
	
	
	
}
