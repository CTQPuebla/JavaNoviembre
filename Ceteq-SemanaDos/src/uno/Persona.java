package uno;

public class Persona {
	String nombres;
	String apellidos;
	int edad;
	String fechaNacimiento;
	double estatura;
	
	public Persona() {
		
	}
	
	public Persona(String nombres, String apellidos,  int edad, String fechaNacimiento, double estatura) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.estatura = estatura;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", fechaNacimiento="
				+ fechaNacimiento + ", estatura=" + estatura + "]";
	}

	public boolean esMayor(int edad) {
		return (edad >= 18) ? true : false;
	}
	
	public String mediaEstatura() {
		return (estatura > 1.64 ) ? "Es mayor que la media" : "Es menor de la media";
	}
	
	public String nombreCompleto() {
		return nombres + " " + apellidos;
	}
}
