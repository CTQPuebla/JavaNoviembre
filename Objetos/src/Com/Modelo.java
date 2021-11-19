package Com;

public class Modelo {

	// atributos-- datos en concreto a lo que se estan modelando
	// metodo constructor
	// Getter & Setters
	// Metodos propios (comportameinto)

	// Atributos dependen de los valores que se haran llegar al modelo
	String atributo1;
	int atributo2;
	double atributo3;

	// Metodo constructor---Lugar a donde se indica como se contruia el objeto
	// publico+nombre de la clase
	public Modelo() {

	}
	
	public Modelo(String atributo1, int atributo2, double atributo3) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}
	//Getter & Setters
	//set para pedir
	//get para recuperar
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

	//Estado de un objeto
	@Override
	public String toString() {
		return "Modelo [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
	}
	
	
	
	


}
