package oop.polimorfismo;

public class Veiculo {
	
	protected String nameString;
	protected String marcaString;
	protected String modeloString;
	
	public Veiculo(String nameString, String marcaString, String modeloString) {
		super();
		this.nameString = nameString;
		this.marcaString = marcaString;
		this.modeloString = modeloString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getMarcaString() {
		return marcaString;
	}

	public void setMarcaString(String marcaString) {
		this.marcaString = marcaString;
	}

	public String getModeloString() {
		return modeloString;
	}

	public void setModeloString(String modeloString) {
		this.modeloString = modeloString;
	}

	public String mostrad() {
		return "Nombre: "+nameString+"\nMarca: "+marcaString+"\nModelo: "+modeloString;
	}
	
	
	

}
