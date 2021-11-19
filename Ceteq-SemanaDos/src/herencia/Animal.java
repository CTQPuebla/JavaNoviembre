package herencia;

public class Animal extends Especie {
	private String nombre;
	private String Habitad;
	
	public Animal() {
		super();
	}

	public Animal(String nombre, String Habitad) {
		super();
		this.nombre = nombre;
		this.Habitad = Habitad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabitad() {
		return Habitad;
	}

	public void setHabitad(String Habitad) {
		this.Habitad = Habitad;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", habitad=" + Habitad + ", reino=" + reino + ", grupo=" + grupo + "]";
	}
}
