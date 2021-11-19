package Viajes;

public class Cliente {
	
	String nombre;
	String fechaNacimiento;
	public Cliente() {
		super();
	}
	public Cliente(String nombre, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	

}
