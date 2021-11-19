import java.util.List;

public class Linea {
	
      String nombre;
      List<Autobus>list;
      
      public Linea(){
    	  
      }

	public Linea(String nombre, List<Autobus> list) {
		this.nombre = nombre;
		this.list = list;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Autobus> getList() {
		return list;
	}

	public void setList(List<Autobus> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Linea [nombre=" + nombre + "]";
	}
      
}
