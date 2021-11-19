package herencia;

public class Especie {
	protected String reino; //Animal, planta
	protected String grupo; //mamifero, aves etc
	
	public Especie() {

	}

	public Especie(String reino, String grupo) {
		super();
		this.reino = reino;
		this.grupo = grupo;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Especie [reino=" + reino + ", grupo=" + grupo + "]";
	}
	
	
}
