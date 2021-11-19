package oop.polimorfismo;

public class Veiculodeportivo extends Veiculo {

	int motor;

	public Veiculodeportivo(String nameString, String marcaString, String modeloString, int motor) {
		super(nameString, marcaString, modeloString);
		this.motor = motor;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public String mostrad() {
		return "Nombre: "+nameString+"\nMarca: "+marcaString+"\nModelo: "+modeloString+"\nMotor: "+motor;
	}
	

}
