import java.util.List;

public class Banco {


	String nombre;
	String nacionalidad;
	String oficinaCentral;
	
	List<Cuenta> list;
	
	public Banco() {
		
	}
	
	public Banco(String nombre, String nacionalidad, String oficinaCentral, List<Cuenta> list) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.oficinaCentral = oficinaCentral;
		this.list = list;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getOficinaCentral() {
		return oficinaCentral;
	}


	public void setOficinaCentral(String oficinaCentral) {
		this.oficinaCentral = oficinaCentral;
	}


	public List<Cuenta> getList() {
		return list;
	}

	public void setList(List<Cuenta> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", oficinaCentral=" + oficinaCentral
				+ ", list=" + list + "]";
	}

}
