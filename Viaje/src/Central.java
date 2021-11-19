
public class Central {
	
	String NumeroBoleto;
	String Nombre;
	String Autobus;
	String Aciento;
	String Anden;
	
	public Central(){
		
	}

	public Central(String numeroBoleto, String nombre, String autobus, String aciento) {
		super();
		NumeroBoleto = numeroBoleto;
		Nombre = nombre;
		Autobus = autobus;
		Aciento = aciento;
	}

	public String getNumeroBoleto() {
		return NumeroBoleto;
	}

	public void setNumeroBoleto(String numeroBoleto) {
		NumeroBoleto = numeroBoleto;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAutobus() {
		return Autobus;
	}

	public void setAutobus(String autobus) {
		Autobus = autobus;
	}

	public String getAciento() {
		return Aciento;
	}

	public void setAciento(String aciento) {
		Aciento = aciento;
	}

	@Override
	public String toString() {
		return "Central [NumeroBoleto=" + NumeroBoleto + ", Nombre=" + Nombre + ", Autobus=" + Autobus + ", Aciento="
				+ Aciento + "]";
	}
	

}
