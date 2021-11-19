

public class Persona extends SerVivo {
	protected String fechaNacimiento;
	
	public Persona() {
		super();
	}

	public Persona(String fechaNacimiento) {
		super();
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", peso=" + peso + "]";
	}

	
}
