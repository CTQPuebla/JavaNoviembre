package uno;

public class Modelo {
	// Atributos \\ - Atributos que dependen de los valores que se haran llegar al modelo
	String atributo1;
	int atributo2;
	double atributo3;
	
	// Metodo Contructor \\ - Lugar donde se indica como se construira el modelo
	public Modelo() {
		
	}

	public Modelo(String atributo1, int atributo2, double atributo3) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}
	
	//Getter & Setters \\
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

	@Override
	public String toString() {
		return "Modelo [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
	}
	
	//Metodos Propios (Comportamiento) \\
}
