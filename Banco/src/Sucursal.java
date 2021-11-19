
public class Sucursal {
	private String direccion;
	private int numEmpleados;
	
	public Sucursal() {
		
	}
	
	public Sucursal(String direccion, int numEmpleados) {
		super();
		this.direccion = direccion;
		this.numEmpleados = numEmpleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEmpleados() {
		return numEmpleados;
	}

	public void setEmpleados(int empleado) {
		this.numEmpleados = empleado;
	}

	@Override
	public String toString() {
		return "Sucursal [direccion=" + direccion + ", numEmpleados=" + numEmpleados + "]";
	}
}
