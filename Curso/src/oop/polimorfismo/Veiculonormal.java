package oop.polimorfismo;

public class Veiculonormal extends Veiculo {

	private int asientos;

	public Veiculonormal(String nameString, String marcaString, String modeloString, int asientos) {
		super(nameString, marcaString, modeloString);
		this.asientos = asientos;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public String mostrad() {
		return "Nombre: "+nameString+"\nMarca: "+marcaString+"\nModelo: "+modeloString+"\n Asientos: "+ asientos;
	}
	

}
