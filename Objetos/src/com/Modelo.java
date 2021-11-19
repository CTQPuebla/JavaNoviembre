package com;

public class Modelo {
	
	//artbutos
	//metodos constructores
	//gatter & setter
	//metodos propios (comportamientos)
	String atributo1;
	int atributo2;
	double atributo3;
	
	//Metodo constructoe -lugar donde se indica como se construria el objeto
	public Modelo(){
		
	
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
          //Estado del objetsos
	@Override
	public String toString() {
		return "Modelo [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
	}
	
	
	
	
	
	

}
