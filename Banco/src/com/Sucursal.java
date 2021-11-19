package com;

public class Sucursal {
int NumEmpleado;
String Direccion;

public Sucursal() {
	
}

public Sucursal(int numEmpleado, String direccion) {

	NumEmpleado = numEmpleado;
	Direccion = direccion;
}

public int getNumEmpleado() {
	return NumEmpleado;
}

public void setNumEmpleado(int numEmpleado) {
	NumEmpleado = numEmpleado;
}

public String getDireccion() {
	return Direccion;
}

public void setDireccion(String direccion) {
	Direccion = direccion;
}

@Override
public String toString() {
	return "Sucursal [NumEmpleado=" + NumEmpleado + ", Direccion=" + Direccion + "]";
}







}
