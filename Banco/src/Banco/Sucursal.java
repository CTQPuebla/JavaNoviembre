package Banco;

public class Sucursal {
	
	String direccion;
	int numEmpleados;
	
	public Sucursal() {
		
	}
	
	public Sucursal(String direccion, int numEmpleados) {
		
		this.direccion = direccion;
		this.numEmpleados = numEmpleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	@Override
	public String toString() {
		return "Sucursal [direccion=" + direccion + ", numEmpleados=" + numEmpleados + "]";
	}
	
	
	
	

}
