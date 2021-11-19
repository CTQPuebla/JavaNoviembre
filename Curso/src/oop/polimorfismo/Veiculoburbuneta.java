package oop.polimorfismo;

public class Veiculoburbuneta extends Veiculo {

	private int peso;

	public Veiculoburbuneta(String nameString, String marcaString, String modeloString, int peso) {
		super(nameString, marcaString, modeloString);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String mostrad() {
		return "Nombre: "+nameString+"\nMarca: "+marcaString+"\nModelo: "+modeloString+"\nPeso: "+peso;
	}
	

}
