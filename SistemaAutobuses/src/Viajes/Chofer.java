package Viajes;

public class Chofer {
	
	String nombre;
	int edad;
	public Chofer() {
		super();
	}
	public Chofer(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Chofer [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	

}
