package ADO;

public class Chofer {
	
	String nombre;
	String edad;
	
	public Chofer() {
		
	}

	public Chofer(String nombre, String edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Chofer [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}
